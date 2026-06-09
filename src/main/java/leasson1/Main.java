package leasson1;
//1. Объявить переменные всех 8 примитивных типов и присвоить им любые значения.
//
//2. Вывести их в консоль с пояснением типа данных.
//
//Приведение типов данных в Java
//1. Объяви переменные:
//byte b = 10;
//int i;
//double d;
//Присвой b переменной i, затем i переменной d
//Выведи все три переменные.
public class Main {
    public static void main(String[] args) {
        byte b= 10; // диапазон: -128 до 127
        int i=b;
        double d=i;
        System.out.println(b);
        System.out.println(i);
        System.out.println(d);

// 2. Объяви переменные:
//double doubleValue = 9.78;
//int intValue = (int) doubleValue;
//Выведи обе переменные и поясни, что произошло
        double doubleValue = 9.78;
        int intValue = (int) doubleValue;
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("intValue = " + intValue);
        // doubleValue число с плавающей точкой — 9.78.
        //При присваивании её значения переменной типа int используется приведение типов: (int) doubleValue.
        //Java не округляет, а отбрасывает дробную часть — это называется усечение .
        //Поэтому 9.78 становится 9.
    }
}
