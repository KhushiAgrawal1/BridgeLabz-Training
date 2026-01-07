package Hash_Map_Hash_Function;
import java.util.HashMap;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(target - num)) {
                return true;
            }
            map.put(num, true);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}

