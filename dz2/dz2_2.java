public class dz2_2 {
    static boolean checkForRotation (String str1, String str2)
    {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    public static void main(String[] args) {
            String str1 ="ABACD";
            String str2 ="CDABA";
                System.out.println("Данные строки: "+str1+"  и  "+str2);
                System.out.println("\nКонкатенация первой строки дважды: "+str1+str1);
            if (checkForRotation(str1, str2))
            {
                    System.out.println("Вторая строка "+str2+"  существует в новой строке.");	
                System.out.println("\nСтроки -  это вращения друг друга");
            }
            else
            {
                  System.out.println("Вторая строка "+str2+"  не существует в новой строке");	
                System.out.printf("\nСтроки -  это не вращения друг друга");
            }
        }
    }
