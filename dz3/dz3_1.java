package dz3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class dz3_1 {
    public static void main(String[] args) {
        List<String> arrray1 = new ArrayList<String>();
        arrray1.add("Красный");
        arrray1.add("Оранжевый");
        arrray1.add("Желтый");
        arrray1.add("Зеленый");
        arrray1.add("Голубой");
        arrray1.add("Синий");
        arrray1.add("Фиолетовый");
        System.out.println("Задание1. Список - " + arrray1);
        System.out.println();
        System.out.println("Задание 2. Итерация всех элементов списка цветов и добавления к каждому символа '!': ");
        for (String item : arrray1) {
            System.out.println(item + "!");
        }
    //    Задание 3. Вставить элемент в список в первой позиции.
        arrray1.add(1, "Черный");
        System.out.println();

        // System.out.println(arrray1);

        System.out.println("Задание 4. Извлечь элемент (по указанному индексу) из заданного списка - " +arrray1.get(1));
        // Задание5. Обновить определенный элемент списка по заданному индексу.
        arrray1.set(1, "Белый");
        arrray1.set(5, "Коричнневый");
        System.out.println("Список обновленный - " + arrray1);
        System.out.println();
        // Удалить третий элемент из списка.
        arrray1.remove(2);
        System.out.println("Список обновленный - " + arrray1);
        // Задание 7. Поиск элемента в списке по строке.
        boolean result = arrray1.stream().anyMatch(arr -> arr.contains("Гол"));
        System.out.println(result);
        // Задание 8. Создать новый список и добавить в него несколько елементов первого списка
        List<String> array2 = new ArrayList<String>();
        array2.add("Белый");
        array2.add("Голубой");
        array2.add("Фиолетовый");
        array2.add("Мятный");
        System.out.println("Список 2 - " + array2);
        System.out.println();
        // Задание 9. Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println("Первый список - " + arrray1);
        arrray1.retainAll(array2);
        System.out.println(arrray1);
        System.out.println(array2);
        System.out.println();
        // *Сортировка списка. Сначала добавлю пару элементов в список 2
        array2.add("Алый");
        array2.add("Янтарный");
        array2.add("Шоколадный");
        System.out.println("Список 2 - " + array2);
        Collections.sort(array2);
        System.out.println(array2);


        

        

        


    }
}