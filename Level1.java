import java.util.ArrayList;

public class Level1 {
    private static ArrayList<Sprite> level;

    public static void loadLevel() {
        if (level == null)
            level = new ArrayList<Sprite>();
    }

    public static ArrayList<Sprite> getLevel() {
        if (level == null)
            level = new ArrayList<Sprite>();
        return level;
    }
}
