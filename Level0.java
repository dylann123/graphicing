import java.util.ArrayList;

public class Level0 {
    private static ArrayList<Sprite> level;

    public static void loadLevel() {
        if (level == null)
            level = new ArrayList<Sprite>();
        Room room = new Room();
        level.addAll(room.getRoom());
        level.add(new NextRoomWall(App.getWidth() - 15, (App.getHeight() / 2) - 100, 15, 200, 1));
    }

    public static ArrayList<Sprite> getLevel() {
        if (level == null)
            level = new ArrayList<Sprite>();
        return level;
    }
}
