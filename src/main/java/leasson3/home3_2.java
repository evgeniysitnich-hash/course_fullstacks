package leasson3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class home3_2 {
    public static void main(String[] args) {
        //2. Добавьте в Set<Student> 5 студентов (одного добавьте дважды). Выведите Set на экран и поясните что произошло.

        Set<String>Student = new HashSet<>();
        Student.add("Василий");
        Student.add("Евгений");
        Student.add("Виктор");
        Student.add("Марина");
        Student.add("Евгений");
        System.out.println(Student + "Set не допускает хранение дублей, так как Евгений упоминается дважды, коллекция Set убирает из списка дубликаты.");
    }
}
