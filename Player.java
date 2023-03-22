import java.awt.*;
import java.util.*;

public class Player extends Sprite {
    private int lives, speed;
    private final static int width = 50, height = 50;
    private HashMap<String, Boolean> keyPresses;

    public Player(int x, int y, Color color) {
        super(x, y, width, height, color);
        keyPresses = new HashMap<String, Boolean>();
        keyPresses.put("Up", false);
        keyPresses.put("Down", false);
        keyPresses.put("Left", false);
        keyPresses.put("Right", false);
        keyPresses.put("W", false);
        keyPresses.put("A", false);
        keyPresses.put("S", false);
        keyPresses.put("D", false);
        lives = 3;
        speed = 5;
    }

    public void tick(ArrayList<Sprite> obstacles) {
        if (keyPresses.get("W") || keyPresses.get("Up")) {
            this.setY(this.getY() - speed);
            for (Sprite o : obstacles) {
                if(o.collidedWith(this) && o instanceof NextRoomWall){
                    
                    NextRoomWall wall = (NextRoomWall) o;
                    Game.setLevel(wall.getLevel());
                }
                while (o.collidedWith(this))
                    this.setY(this.getY() + 1);
            }
        }
        if (keyPresses.get("S") || keyPresses.get("Down")) {
            this.setY(this.getY() + speed);
            for (Sprite o : obstacles) {
                if(o.collidedWith(this) && o instanceof NextRoomWall){
                    NextRoomWall wall = (NextRoomWall) o;
                    Game.setLevel(wall.getLevel());
                }
                while (o.collidedWith(this))
                    this.setY(this.getY() - 1);
            }
        }
        if (keyPresses.get("A") || keyPresses.get("Left")) {
            this.setX(this.getX() - speed);
            for (Sprite o : obstacles) {
                if(o.collidedWith(this) && o instanceof NextRoomWall){
                    NextRoomWall wall = (NextRoomWall) o;
                    Game.setLevel(wall.getLevel());
                }
                while (o.collidedWith(this))
                    this.setX(this.getX() + 1);
            }
        }
        if (keyPresses.get("D") || keyPresses.get("Right")) {
            this.setX(this.getX() + speed);
            for (Sprite o : obstacles) {
                if(o.collidedWith(this) && o instanceof NextRoomWall){
                    NextRoomWall wall = (NextRoomWall) o;
                    Game.setLevel(wall.getLevel());
                }
                while (o.collidedWith(this))
                    this.setX(this.getX() - 1);
            }
        }
    }

    public int getLives() {
        return lives;
    }

    public void draw(Graphics g) {
        g.setColor(this.getColor());
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void updateInput(String key, boolean value) {
        keyPresses.put(key, value);
    }
}
