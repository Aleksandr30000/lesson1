package Lesson21;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height=height;
    }

    @Override
    public void rezult(Athletes a) {
        a.jump(height);
    }
}