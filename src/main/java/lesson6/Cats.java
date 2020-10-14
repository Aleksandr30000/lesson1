package lesson6;

public class Cats extends Animals {
    private static int catCount;

    public Cats(String name){
        super(name);
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

    @Override
    protected void run(int dist) {
        if (dist <= 200){
            System.out.println(getName() + " пробежал " + dist + " м.");
        } else {
            System.out.println(getName() + " пробежал 200 м.");
        }
    }

    @Override
    protected void swim(int dist) {
        System.out.println(getName() + " не умеет плавать!!!");
    }
}