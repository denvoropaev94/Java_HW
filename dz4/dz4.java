// Написать приложение для ввода ФИО, возраст и пол пользователей. 
// Данные хранить в разных списках. Сортировать пользователей по возрасту. 
// Не вывести в порядке возрастания возрастов а именно сортировать!)
package dz4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class dz4 {
    public static void main(String[] args) {
    ArrayList<String> list_fname = new ArrayList<>();
    ArrayList<String> list_lname = new ArrayList<>();
    ArrayList<String> list_tname = new ArrayList<>();
    ArrayList<Integer> list_age = new ArrayList<>();
    ArrayList<String> list_sex = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();
    
    boolean flag = true;
    while (flag) {
        Scanner scanner = new Scanner (System. in);
        Scanner scanner_age = new Scanner (System. in);
        Scanner scanner_sex = new Scanner (System. in);

        System.out.println("Введите ваше ФИО: ");
        String fio = scanner.nextLine();
        System.out.println("Введите ваш возраст: ");
        Integer age = scanner_age.nextInt();
        list_age.add(age);
        String[] fio1 = fio.split (" ");
        if (fio1.length == 3) {
            list_fname.add(fio1[1]);
            list_lname.add(fio1[0]);
            list_tname.add(fio1[2]);
         } 
         else if (fio1.length == 2) {
            list_lname.add(fio1 [0]);
            list_fname.add (fio1 [1]);
            list_tname.add ("");
            } else {
                list_lname. add(fio1[0]);
                list_fname.add("");
                list_tname.add ("");
            }
            System.out.println("Введите ваш пол");
            String gender = scanner_sex.nextLine();
            if (gender.contains("M")) {
                list_sex.add("true");
            }
            else{
                list_sex.add("false");
            }
            linkedList.add(list_age.size() - 1);

            System.out.println("Желаете добавить еще человека} Y/N");
            Scanner scanner1 = new Scanner (System. in);
            String yn = scanner1.nextLine();
            if (yn.toUpperCase().equals ("N")) {
            flag = false; 
            }
    }
    int key = list_age.size()-1;
    while(key > -1){
        int max_age = list_age.get(linkedList.get(key));
        int index = key;
        for (int i = 0; i < key; i++) {
            if (max_age < list_age.get(linkedList.get(i))){
                max_age = list_age.get(linkedList.get(i));
                index = i; 
            }            
        }
        int tmp = linkedList.get(key);
        linkedList.set(key, linkedList.get(index));
        linkedList.set(index,tmp);

        key--;
    }
    int count = linkedList.size();

        ArrayList<String> list_fname_sort = new ArrayList<>(count);
        ArrayList<String> list_lname_sort = new ArrayList<>(count);
        ArrayList<String> list_tname_sort = new ArrayList<>(count);
        ArrayList<Integer> list_age_sort = new ArrayList<>(count);
        ArrayList<String> list_sex_sort = new ArrayList<>(count);
        

        for (int i : linkedList){
        list_fname_sort.add(list_fname.get(i));
        list_lname_sort.add(list_lname.get(i));
        list_tname_sort.add(list_tname.get(i));
        list_age_sort.add(list_age.get(i));
        list_sex_sort.add(list_sex.get(i));
    }

    for (int i = 0; i < count; i++){
    System.out.println(list_fname_sort.get(i) + " " + list_lname_sort.get(i) + " " + list_tname_sort.get(i) + " " + list_age_sort.get(i) + " " + list_sex_sort.get(i));
    }
    System.out.println(list_fname_sort);
        System.out.println(list_lname_sort);
        System.out.println(list_tname_sort);
        System.out.println(list_age_sort);
        System.out.println(list_sex_sort);
    
}
}