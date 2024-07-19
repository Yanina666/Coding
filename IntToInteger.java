import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//с помощью стримов переводим Int в Integer

public class IntToInteger {
        public static void main(String[] args) {
            int[] sortedList = {3, 5, 5, 6, 9, 5, 3, 11, 10};
            Set<Integer> set = new HashSet<>();
            List<Integer> listInt = Arrays.stream(sortedList).boxed().collect(Collectors.toList());
            set.addAll(listInt);
            System.out.println(listInt);
        }
    }
