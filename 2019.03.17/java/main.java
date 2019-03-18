import java.util.Arrays;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        Integer[] numList1 = {3, 4, -1, 1};
        Integer[] numList2 = {1, 2, 0};

        int result1 = findLowestPositive(numList1);
        int result2 = findLowestPositive(numList2);

        System.out.println(String.format("result1: %d", result1));
        System.out.println(String.format("result2: %d", result2));
    }

    public static int findLowestPositive(Integer[] numList) {
         // find min and max value
        int min = Collections.min(Arrays.asList(numList));
        int max = Collections.max(Arrays.asList(numList));

        // iterate from min to max by an increment of 1
        int num;
        for (num = min; num <= max; num++) {
            // check if num is in numList and a positive
            if (!Arrays.asList(numList).contains(num) && num > 0) {
                return num;
            }
        }
        return num;
    }
}