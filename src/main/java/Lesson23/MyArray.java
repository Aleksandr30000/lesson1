package Lesson23;

import java.util.*;

public class MyArray {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("дом", "дорога", "ковер", "самолет", "стул",
                "дерево", "самолет", "окно", "стол", "листок", "заяц", "машина", "скамейка", "фонарь", "листок",
                "самолет", "фонтан", "кот", "листок", "самолет"));
        System.out.println(arrayList);

        Set<String> original = new HashSet<>();
        for (String s : arrayList) {
            if (original.add(s)){
                System.out.print(s + " - " + Collections.frequency(arrayList, s) + "; ");
            }
        }

    }
}
