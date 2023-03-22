import java.awt.*;
import java.util.ArrayList;

public class Sprite {

    private int x, y, width, height;
    private Color color;

    public Sprite(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics g){
        // This method will be overridden by subclasses
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void tick(ArrayList<Sprite> obstacles){
        // This method will be overridden by subclasses
    }

    public boolean collidedWith(Sprite sprite){
        return false;
    }

    public Color getColor(){
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
