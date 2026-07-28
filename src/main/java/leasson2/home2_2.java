package leasson2;

public class home2_2 {
    public static void main(String[] args) {
        //2.Объяви переменную:
        //String str = "276";
        //Присвой это значение таким типам как: Double, Integer, Long..


        String str = "276";
        Double dbl = Double.valueOf(String.valueOf(str));
        Integer in = Integer.valueOf(String.valueOf(str));
        Long ln = Long.valueOf(String.valueOf(str));
        System.out.println("Double:" +dbl);
        System.out.println("Integer:" +in);
        System.out.println("Long:" +ln);

    }
}
