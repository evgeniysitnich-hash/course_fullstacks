package leasson3;

import java.util.Random;

public class home3_4 {
    public static void main(String[] args) {
        // 4. Создайте массив из 10 случайных целых чисел. Посчитайте и выведите сумму всех элементов массива.* (Задание со звездочкой).
        Random random = new Random();
        int[] numbers = new int[10];

        int sum = 0;



        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // числа от 0 до 99
            sum += numbers[i];
        }

        System.out.print("Массив случайных чисел: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nСумма всех элементов массива: " + sum);
    }
}
