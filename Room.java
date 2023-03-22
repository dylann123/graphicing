import java.util.ArrayList;

public class Room {
    private ArrayList<Sprite> walls;
    public Room(){
        walls = new ArrayList<Sprite>();
        walls.add(new BasicWall(0, 0, App.getWidth(), 10));
        walls.add(new BasicWall(0, App.getHeight()-10, App.getWidth(), 10));
        walls.add(new BasicWall(App.getWidth(), 0, 10, App.getHeight()));
        walls.add(new BasicWall(0, 0, 10, App.getHeight()));
    }
    public ArrayList<Sprite> getRoom(){
        return walls;
    }
}
