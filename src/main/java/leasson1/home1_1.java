package leasson1;

public class home1_1 {public static void main(String[] args) {
    //1. Объявить переменные всех 8 примитивных типов и присвоить им любые значения.
    //2. Вывести их в консоль с пояснением типа данных.
    // 1. byte — 8-битное целое со знаком
    byte a = 100;

    // 2. short — 16-битное целое со знаком
    short b = 1000;

    // 3. int — 32-битное целое со знаком (самый распространённый)
    int c = 100000;

    // 4. long — 64-битное целое со знаком
    // Обязательно добавляем суффикс 'L' или 'l' (лучше 'L' для читаемости)
    long d = 15000000000L;

    // 5. float — 32-битное число с плавающей точкой одинарной точности
    // Требует суффикса 'F' или 'f'
    float f = 3.14f;

    // 6. double — 64-битное число с плавающей точкой
    double g = 3.1415926535;

    // 7. char — 16-битный символ Unicode
    // Значение заключается в одинарные кавычки
    char  e = 'A';

    // 8. boolean — логический тип (true или false)
    boolean h = true;

    System.out.println("byte: " + a);
    System.out.println("short: " + b);
    System.out.println("int: " + c);
    System.out.println("long: " + d);
    System.out.println("float: " + f);
    System.out.println("double: " + g);
    System.out.println("char: " + e);
    System.out.println("boolean: " + h);

}
}

