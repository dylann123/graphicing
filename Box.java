import java.awt.*;

public class Box extends Sprite{

    public Box(int x, int y, int w, int h, Color color){
        super(x, y, w, h, color);
    }

    public void tick(){
        
    }

    public void draw(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
