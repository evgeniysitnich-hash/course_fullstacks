package leasson4;

import java.util.Scanner;

public class home4_1 {
   // Напиши программу, которая проверяет возраст пользователя:
   // Если возраст < 18 → вывести "Доступ запрещен".
    //Если от 18 до 60 → вывести "Доступ разрешен".
    //Если больше 60 → вывести "Вы в зоне риска".


       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Введите ваш возраст: ");
           int age = scanner.nextInt();

           if (age < 18) {
               System.out.println("Доступ запрещен");
           } else if (age <= 60) {
               System.out.println("Доступ разрешен");
           } else {
               System.out.println("Вы в зоне риска");
           }

           scanner.close();

    }
}
