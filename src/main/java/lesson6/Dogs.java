package lesson6;

public class Dogs extends Animals {
    private static int dogCount;

    public Dogs(String name){
        super(name);
        dogCount++;
    }

    public static int getDogCount(){
        return dogCount;
    }

    @Override
    protected void run(int dist) {
        if (dist <= 500){
            System.out.println(getName() + " пробежал " + dist + " м.");
        } else {
            System.out.println(getName() + " пробежал 500 м.");
        }

    }

    @Override
    protected void swim(int dist) {
        if (dist <= 10){
            System.out.println(getName() + " проплыл " + dist + " м.");
        } else {
            System.out.println(getName() + " проплыл 10 м.");
        }

    }
}
