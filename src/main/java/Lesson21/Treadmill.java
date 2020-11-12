package Lesson21;

public class Treadmill implements Obstacles {
    private int dist;

    public Treadmill(int dist) {
        this.dist=dist;
    }

    @Override
    public void rezult(Athletes a) {
        a.run(dist);
    }
}
