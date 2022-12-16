package lr3;
import java.util.*;


public class Example11 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        int[] nums = new int[100];
        Random random = new Random();
        for (int i = 0 ; i < nums.length ; i++ ){
            nums[i] = random.nextInt(200);

        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) { {
            System.out.println(nums[i] );
        }}}}