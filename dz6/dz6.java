package dz6;
//Реализовать множество (set) с помощью TreeMap. Создать метод add, добавляющий элемент в ваше множество.
//Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
//Объявить и инициализировать TreeSet использующий ваш компаратор. Добавить несколько эллементов в сет и вывести в консоль.
import java.util.*;

public class dz6 {

    static Map<Integer, Integer> setMap = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    static Set<Integer> setTree = new TreeSet<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    public static void main(String[] args) {
        methodPut(7);
        methodPut(11);
        methodPut(8);
        methodPut(3);
        System.out.println(setMap);
        methodPutTwo(55);
        methodPutTwo(30);
        methodPutTwo(27);
        methodPutTwo(12);
        System.out.println(setTree);

    }
    static void methodPut(int x){
        setMap.put(x, 1);
    }
    static void methodPutTwo(int x){
        setTree.add(x);
    }

}