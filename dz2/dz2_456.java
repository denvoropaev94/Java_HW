// Дано два числа, например 3 и 56, 
// необходимо составить следующие строки: 3 + 56 = 59
//  3 – 56 = -53 3 * 56 = 168 
// Используем метод StringBuilder.append().

public class dz2_456 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = createSome(3, 56);
        System.out.println(stringBuilder);
        modifySome(stringBuilder);
        System.out.println(stringBuilder);
        modifySomeReplace(stringBuilder, "+", "плюс");
        System.out.println(stringBuilder);
        modifySomeReplace(stringBuilder, "-", "минус");
        System.out.println(stringBuilder);
        modifySomeReplace(stringBuilder, "*", "умножить");
        System.out.println(stringBuilder);
    }
    public static StringBuilder createSome(int a, int b){
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a+b).append("\n")
            .append(a).append(" - ").append(b).append(" = ").append(a-b).append("\n")
            .append(a).append(" * ").append(b).append(" = ").append(a*b).append("\n");
        return result;
    }
    //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt()
    public static StringBuilder modifySome(StringBuilder stringBuilder){
        int pos1;
        while ((pos1 = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(pos1);
            stringBuilder.insert(pos1, "равно");
        }
        return stringBuilder;
    }
    //*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace()
    //Только в этом методе я заменил "+" на "плюс", "-" на "минус", "*" на "умножить"
    public static StringBuilder modifySomeReplace(StringBuilder stringBuilder, String oldString, String newString){
        int pos2;
        while ((pos2 = stringBuilder.indexOf(oldString)) != -1) {
            stringBuilder.replace(pos2, pos2 + 1, newString);
        }
        return stringBuilder;
    }
}
