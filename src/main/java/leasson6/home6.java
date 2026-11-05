package leasson6;
//№6 Методы в Java (как в них передавать и возвращать значения, перегрузка методов).
//Создать класс Calculator, и реализовать в нем методы на
// сложение и вычитание используя перегрузку методов и чтобы методы возвращали разные типы данных

public class home6 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1,2,3,8,9,5,4,5));
        System.out.println(calculator.sub(100.1,55.5));
    }

    public static class Calculator {

        public Integer sum(Integer... x) {
            int result = 0;
            for (int i = 0; i < x.length; i++) {
                result = result + x[i];
            }
            return result;
        }

        public Double sum (Double... x) {
            double result = 0;
            for (int i = 0; i < x.length; i++) {
                result = result + x[i];
            }
            return result;
        }
        public Float sum  (Float... x) {
            float result = 0;
            for (int i = 0; i < x.length; i++) {
                result = result + x[i];
            }
            return result;
        }
        public Integer sub (Integer x, Integer y) {
            return x - y;
        }
        public Float sub (Float x, Float y) {
            return x - y;
        }
        public Double sub (Double x, Double y) {
            return x - y;
        }
    }

}

