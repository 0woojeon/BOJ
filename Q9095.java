import java.util.Scanner;

public class Q9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] nums = new int[11];

            nums[1] = 1;
            nums[2] = 2;
            nums[3] = 4;
            for (int j = 4; j <= n; j++) {
                nums[j] = nums[j - 1] + nums[j - 2] + nums[j - 3];
            }

            System.out.println(nums[n]);
        }

    }
}
