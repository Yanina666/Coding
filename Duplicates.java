
import java.util.HashSet;

public class Duplicates {

    //реализовать метод, который будет возвращать количество передаваемого символа в слове.
    //Пример: countCharAtWord('s', 'soska')
    public static int countSymbolsAtString(char s, String str){
        int counter = 0;
        String result = str.toLowerCase();
        char[] chars = result.toCharArray();
        for (int i = 0; i < chars.length; i++ ){
if (s == chars[i]) {
   counter = counter +1;
}
        }
        return counter;
    }

    //на вход строка и нужно подсчитать кол-во символов
    public static int method(String word){
        return word.toCharArray().length;
    }

    //нужно перевернуть строку.
    //для этого создадим массив чаров
    public static String reverseString(String str){
        char[] chars = str.toCharArray();
for(int i = 0; i < chars.length/2; i++) {
    char tmp = chars[i]; //это мы возьмем первый элемент
    chars[i] = chars[chars.length -i - 1]; //от массива идем в обратном направлении
    chars[chars.length -i -1] = tmp;
}
return new String(chars); //создадим новую строку,которая получилась
    }

    public static void main(String[] args) {
        int[] sortedList = {3, 5, 5, 6, 1, 9, 5, 3, 11, 10};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < sortedList.length; i++) {
           hashSet.add(sortedList[i]);
        }
        //System.out.println(hashSet);
        //System.out.println(method("Love"));
        //System.out.println(reverseString("12345"));
        //String str = "Hello world";
        System.out.println(countSymbolsAtString('s', "Sosssska"));
    }
}








