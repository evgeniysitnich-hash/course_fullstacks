package leasson4;

import java.util.ArrayList;
import java.util.List;

public class home4_2 {
    public static void main(String[] args) {
       // Циклический оператор While
        //  Объяви List и заполни его числами от 1 до 10.
        // Выведи на экран числа от 1 до 10 с помощью while.
        // Выведи числа от 10 до 1 с помощью while.
        // С помощью while найди сумму чисел всех значений твоего листа.


// Создаем список и заполняем числами от 1 до 10

        List<Integer> numbers = new ArrayList<>();

        int i = 1;
        while (i <= 10) {
            numbers.add(i);
            i++;
        }

        // Вывод чисел от 1 до 10 с пом. while
        System.out.println("Числа от 1 до 10:");
        i = 0;
        while (i < numbers.size())
        {
            System.out.print(numbers.get(i) + " ");
            i++;
        }

        // Вывод чисел от 10 до 1 с пом. while
        System.out.println("Числа от 10 до 1:");
        i = numbers.size() - 1;
        while (i >= 0) {
            System.out.print(numbers.get(i) + " ");
            i--;
        }

        // Нахождение суммы элементов списка с использованием  While

        int sum = 0;
        i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }

        System.out.println("Сумма элементов: " + sum);
    }
}
