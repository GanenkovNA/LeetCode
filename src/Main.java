import java.util.Arrays;
import Tasks.Two_Sum;

public class Main {
    public static void main(String[] args) {

        Two_Sum test = new Two_Sum();
        int[] nums = {1, 2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(test.twoSum(nums, target)));
    }
}