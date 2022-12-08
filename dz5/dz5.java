package dz5;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class dz5 {
    public static void main(String[] args) {
    Random random = new Random(36);
    //Создание словаря HashMap
        Map<Integer, String> colors = new HashMap<>();
        colors.putIfAbsent(1, "white");
        colors.put(2, "black");
        colors.put(3, "green");
        colors.put(4, "blue");
        colors.putIfAbsent(5, "orange");
        // System.out.println(colors); 
        //Изменить значения дописав восклицательные знаки
        colors.forEach((k,v) -> System.out.println("key:"+k + " value:"+v+"!"));
        //Создание дерева
        Map<Integer, String> col = new TreeMap<>();
        col.putIfAbsent(6, "белый");
        col.put(7, "фиолетовый");
        col.put(8, "сиреневый");
        col.forEach((k,v) -> System.out.println("key:"+k + " value:"+v+"%"));
        // Увеличить количество элементов таблиц до 1000 случайными ключами и общей строкой
        // Map<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < 10; i++){
            int number = random.nextInt(10000);
            String str = "white";
            colors.put(number, str);
            col.put(number, str);
        }
            System.out.println("Hash----" + colors);
            System.out.println("Tree:::::" + col);

    }
}
