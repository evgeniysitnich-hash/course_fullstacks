package leasson3;

import java.util.HashMap;
import java.util.Map;

public class home3_3 {
    public static void main(String[] args) {
       // 3. Создайте Map<String, Integer>, где ключом будет название фрукта, а значением — его цена в магазине. Заполните словарь 5-6 элементами.
//Map<String, Integer> — это структура данных, которая хранит ("ключ" , значение); .
//Ключ (String) — название фрукта
//Значение (Integer) — его цена в рублях

        Map<String, Integer>fruitsAndprices = new HashMap<>();
        fruitsAndprices.put("Банан", 100);
        fruitsAndprices.put("Апельсин", 133);
        fruitsAndprices.put("Киви", 150);
        fruitsAndprices.put("Яблоко", 200);
        fruitsAndprices.put("Груша", 300);
        fruitsAndprices.put("Лимон", 400);
        System.out.println(fruitsAndprices);
    }
}
