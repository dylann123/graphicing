import java.awt.*;

public class BasicWall extends Obstacle {

    public BasicWall(int x, int y, int width, int height) {
        super(x,y,width,height,Color.gray);
    }

    public BasicWall(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.fillRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }

    public void tick(){

    }

    @Override
    public boolean collidedWith(Sprite sprite) {
        return 
            (super.getX() < sprite.getX() + sprite.getWidth() && 
            sprite.getX() < super.getX()+super.getWidth() &&
            super.getY() < sprite.getY() + sprite.getHeight() &&
            sprite.getY() < super.getY()+super.getHeight());
    }

}
