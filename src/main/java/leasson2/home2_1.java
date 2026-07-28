package leasson2;

public class home2_1 {
    public static void main(String[] args) {
       // №2 Операторы сравнения и логические
       // 1. Объяви переменные:
        //int age = 25;
       // boolean hasTicket = true;
       // boolean canEnter = age >= 18 && hasTicket;
       // System.out.println("Can enter: " + canEnter);
       // Что произойдёт, если hasTicket = false?
             //   Попробуй изменить && на || — как меняется логика??


        int age = 25;
        boolean hasTicket = true;
        boolean canEnter = age >= 18 && hasTicket;
        System.out.println("Can enter: " + canEnter);

        // hasTicket = false
        boolean hasTicket2 = false;
        boolean canEnter2 = age >= 18 && hasTicket2;
        System.out.println("Can enter2: " + canEnter2);
        System.out.println("\"если hasTicket = false то у нас Can enter:  будет false, потому что совпало оба условия логического И &&): " + canEnter2);

        // Меняем && на ||
        boolean canEnter3OR = age >= 18 || hasTicket2;
        System.out.println("Can enter3OR:" +canEnter3OR);
        System.out.println("если hasTicket2 = false однако оператор у нас логичеcкое ИЛИ || то у нас \"Can enter3OR: \" будет true потому что одно из утверждений верно");


    }
}
