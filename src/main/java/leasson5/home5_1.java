package leasson5;

import java.util.Scanner;

public class home5_1 {
    //Оператор Switch
//Написать программу, которая выводит, к какому времени года относится месяц

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер месяца (1-12): ");
            int month = scanner.nextInt();

            String season = switch (month) {
                case 12, 1, 2 -> "Зима";
                case 3, 4, 5 -> "Весна";
                case 6, 7, 8 -> "Лето";
                case 9, 10, 11 -> "Осень";
                default -> "Некорректный номер месяца";
            };

            System.out.println("Месяц " + month + " относится к сезону: " + season);

            scanner.close();
        }
    }

