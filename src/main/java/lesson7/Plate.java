package lesson7;

public class Plate {
    private int food;

    public void setFood(int food){
        if (food<0){                //еду можно только добавить, забрать нельзя
            return;
        }
        this.food += food;
    }

    public void decreaseFood(int amount, Cat cat) {
        if (amount < 0 || food - amount < 0) {
            System.out.println("Еды недостаточно или неправильный аппетит!");
            return;
        }
        cat.setSatiety(true);
        food -= amount;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
