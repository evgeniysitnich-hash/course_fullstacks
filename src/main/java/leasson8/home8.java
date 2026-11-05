package leasson8;
//№8 Обзор интерфейса Stream.
//
//1. Создай массив чисел int[] nums = {5, 8, 12, 3, 17, 4, 9}.
//    С помощью стрима и filter() посчитай, сколько чисел больше 7.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class home8 {
    public static void main(String[] args) {
        int[] nums = {5, 8, 12, 3, 17, 4, 9};
        long numbCount = Arrays.stream(nums).filter(n -> n > 7).count();
        System.out.println("Количество чисел больше 7 = " + numbCount);

        //2. Создай список чисел от 1 до 20.
        //С помощью Stream и filter() выведи только чётные числа.
        List<Integer> nums1 = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            nums1.add(i);
        }
        System.out.println("Список чётных чисел = ");
        nums1.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}