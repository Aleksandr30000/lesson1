package Lesson23;

import java.util.*;

public class telDirectory {
    public static void main(String[] args) {

        Map<String, String> td = new HashMap<>();
        td.put("1-23-45", "Иванов");
        td.put("2-31-42", "Петров");
        td.put("8-62-74", "Сидоров");
        td.put("2-87-62", "Васильев");
        td.put("7-63-35", "Петров");

        //Добавление записи
        td.put("4-43-67", "Сидоров");

        //Поиск номера по фамилии
        String name = "Иванов";    //Сюда пишем фамилию человека, телефон которого надо найти
        ArrayList<String> tel = new ArrayList<>();
        td.forEach((k, v) -> {
            if (v == name) {
                tel.add(k);
            }
        });
        System.out.print(name+tel);

    }
}
