package lesson6;

public class Animals {
    private String name;
    private static int animalsCount;

    public Animals (String name){
        this.name = name;
        animalsCount++;
    }

    public String getName() {
        return name;
    }

    public static int getAnimalsCount(){
        return animalsCount;
    }

    protected void run(int dist) {
        System.out.println(name + " пробежал " + dist + " м.");
    }

    protected void swim(int dist) {
        System.out.println(name + " проплыл " + dist + " м.");
    }
}
