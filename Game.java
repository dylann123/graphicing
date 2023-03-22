import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*; 

public class Game extends JPanel {
    private Player player;
    private ArrayList<Sprite> sprites;
    private static int level = 0, loadedLevel = 0;
    private boolean inGame;

    public Game() {
        inGame = true;
        sprites = new ArrayList<Sprite>();
        player = new Player(50, 50, Color.red);
        loadLevel();
    }

    public static void setLevel(int l) {
        level = l;
    }

    public void loadLevel() {
        switch (level) {
            case 0:
                Level0.loadLevel();
                sprites = Level0.getLevel();
                loadedLevel = 0;
                break;
            case 1:
                Level1.loadLevel();
                sprites = Level1.getLevel();
                loadedLevel = 1;
                break;
            default:
                loadedLevel = level;

                break;
        }
        sprites.add(player);
    }

    public void tick() {
        if(loadedLevel != level){
            loadLevel();
        }
        for (Sprite s : sprites) {
            s.tick(sprites);
        }
    }

    private void drawFrame(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for (Sprite s : sprites) {
            s.draw(g);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawFrame(g);
    }

    public void keyDown(KeyEvent e) {
        String key = KeyEvent.getKeyText(e.getKeyCode());
        if (inGame)
            player.updateInput(key, true);

    }

    public void keyUp(KeyEvent e) {
        String key = KeyEvent.getKeyText(e.getKeyCode());
        if (inGame)
            player.updateInput(key, false);
    }
}
