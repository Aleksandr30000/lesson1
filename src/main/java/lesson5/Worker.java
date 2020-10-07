package lesson5;

public class Worker {
    String family;
    String position;
    String email;
    String telephone;
    int pay;
    int age;

    //   public Worker() {
    //       family = "Иванов Иван Иванович" ;
    //       position = "менеджер";
    //       email = "ivanov@mail.ru";
    //       telephone = "99999999999";
    //       pay = 10000;
    //       age = 25;
    //   }

    public Worker(String family, String position, String email, String telephone, int pay, int age) {
        this.family = family;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.pay = pay;
        this.age = age;
    }

    public static void main(String[] args) {
        //    Worker Worker1 = new Worker();
        //    System.out.println( "Сотрудник1 \n ФИО: " + Worker1.family  + "\n должность: " + Worker1.position + "\n email: " + Worker1.email + "\n телефон: " + Worker1.telephone + "\n зарплата: " + Worker1.pay + "\n возраст: " + Worker1.age);

        Worker[] workers = new Worker[5]; // Вначале объявляем массив объектов
        workers[0] = new Worker("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        workers[1] = new Worker("Петров Петр", "Водитель", "petrov@mailbox.com", "894223456", 250000, 45);
        workers[2] = new Worker("Сидоров Сидр", "Пилот", "sidorov@mailbox.com", "8909889679", 550000, 35);
        workers[3] = new Worker("Васин Андрей", "Аналитик", "vasin@mailbox.com", "8909564355", 400000, 41);
        workers[4] = new Worker("Андреев Василий", "Бригадир", "andreev@mailbox.com", "8908648543", 35000, 40);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                System.out.println("Сотрудник: \n ФИО: " + workers[i].family  + "\n должность: " + workers[i].position + "\n email: " + workers[i].email + "\n телефон: " + workers[i].telephone + "\n зарплата: " + workers[i].pay + "\n возраст: " + workers[i].age);
            }
        }
    }
}
