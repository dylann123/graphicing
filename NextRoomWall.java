import java.awt.Color;

public class NextRoomWall extends BasicWall {
    private int level;
    public NextRoomWall(int x, int y, int width, int height, int level) {
        super(x, y, width, height, Color.GREEN);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    
}
