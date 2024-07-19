import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

