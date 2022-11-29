import java.util.Arrays;

public class dz2_1 {
public static void main(String[] args) {
    task1();
}
static void task1 () {
    String stringFirst = "найти наименьшее окно в строке";
    String stringSecond = "содержащей все символы окно  другой строке наверное";
    String[] arr1 = stringFirst.split(" ");
    String[] arr2 = stringSecond.split(" ");
    String[] arr3 = new String[arr1.length > arr2.length ? arr1.length : arr2.length];
    System.out.println(Arrays.toString(arr1));
    int count = 0;
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr2.length; j++) {
            if (arr1[i].compareTo(arr2[j]) == 0) {
                arr3[count++] = arr1[i];
            }
        }
    }
    int minLength = 100;
    String result = null;
    for (String each : arr3 ) {
        if (each != null && each.length()<minLength) {
            minLength = each.length();
            result = each;
        }
    }
    System.out.println(result);

}

// private static StringBuilder stringReverse(StringBuilder s1) {

//     if (s1.length() == 0)
//         return tmp;
//     else {
//         tmp.append(s1.charAt(s1.length() - 1));
//         return stringReverse(s1.deleteCharAt(s1.length() - 1));
//     }

// }
}
