import javax.swing.*;
import java.awt.event.*;

public class App implements KeyListener{
    static private JFrame mainFrame;
    private Game game;

    public App(){
        mainFrame = new JFrame();
        setFrameOptions(mainFrame);

        game = new Game();
        mainFrame.add(game);

        mainFrame.addKeyListener(this);
        // make sure the game is the focus
        mainFrame.setFocusable(true);
        mainFrame.requestFocusInWindow();
        // tick the game every 30 milliseconds
        ActionListener tick = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                game.tick();
                game.repaint();
            }
        };
        Timer timer = new Timer(1000/60, tick);
        timer.start();
        
    }

    public void start(){
        mainFrame.setVisible(true);
    }

    public JFrame getMainFrame(){
        return mainFrame;
    }

    public Game getGame(){
        return game;
    }

    private void setFrameOptions(JFrame frame){
        frame.setTitle("Le jeu du video!");
        frame.setBounds(0, 0, 1000, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static int getWidth(){
        return mainFrame.getWidth()-27;
    }

    public static int getHeight(){
        return mainFrame.getHeight()-40;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // unused
    }

    @Override
    public void keyPressed(KeyEvent e) {
        game.keyDown(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        game.keyUp(e);
    }
}
