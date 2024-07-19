import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
     int[] sortedList = {3, 5, 5, 6, 1, 9, 5, 3, 11, 10};
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < sortedList.length; i++) {
            hashSet.add(sortedList[i]);
        }
        System.out.println(hashSet);
    }
}
