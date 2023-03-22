import java.awt.*;

public class Obstacle extends Sprite{
    public Obstacle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }
    public boolean collidedWith(Sprite sprite){
        return false;
    };
    public void draw(Graphics g){

    };
}
