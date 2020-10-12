package lesson6;

public class Main {
    public static void main(String[] args) {
        Cats cat1 = new Cats("Барсик");
        Cats cat2 = new Cats("Мурзик");
        Cats cat3 = new Cats("Васька");
        Dogs dog1 = new Dogs("Тузик");
        cat1.run(300);
        dog1.run(300);
        cat1.swim(10);
        dog1.swim(50);

        System.out.println("\nВсего создано " + Animals.getAnimalsCount() + " животных");
        System.out.println("Из них собак - " + Dogs.getDogCount() );
        System.out.println("Из них кошек - " + Cats.getCatCount());
        System.out.println("Из них просто животных - " + (Animals.getAnimalsCount() - Cats.getCatCount() - Dogs.getDogCount()));
    }
}
