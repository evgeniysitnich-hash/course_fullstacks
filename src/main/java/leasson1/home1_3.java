package leasson1;

public class home1_3 {
    public static void main(String[] args) {
        //double doubleValue = 9.78;
//int intValue = (int) doubleValue;
//Выведи обе переменные и поясни, что произошло
        double doubleValue = 9.78;
        int intValue = (int) doubleValue;
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("intValue = " + intValue);
        // doubleValue число с плавающей точкой — 9.78.
        //При присваивании её значения переменной типа int используется приведение типов: (int) doubleValue.
        //Java не округляет, а отбрасывает дробную часть — это называется усечение
        //Поэтому 9.78 становится 9
    }
}
