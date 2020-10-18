package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
        this.appetite = 10;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety(){
        return satiety;
    }

    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println("Cat " + name + " eat...");
        plate.decreaseFood(appetite, this);
    }

}
