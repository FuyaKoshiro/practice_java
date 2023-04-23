import java.util.Arrays;

class Main {
    public static void main(String[] arg) {
        Solution solution = new Solution();
        int[] intArray = {2,7,11,15};
        int target = 9;
        int[] answer = solution.twoSum(intArray, target);
        System.out.println(Arrays.toString(answer));
    }
}