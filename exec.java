import java.util.Arrays;

public class exec {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30};
        
        System.out.println(Arrays.toString(nums)); 
        System.out.println(nums[0]); 
        
        for (int num : nums) {
            System.out.print(num + " "); 
        }
    }
}