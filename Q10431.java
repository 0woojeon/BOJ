import java.util.Scanner;

public class Q10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int numm = sc.nextInt();
            int cnt = 0;
            Integer nums[] = new Integer[20];
            for (int j = 0; j < 20; j++) {
                nums[j] = sc.nextInt();
            }

            for (int j = 1; j < 20; j++) {
                for (int k = j - 1; k >= 0; k--) {
                    if (nums[k] > nums[j]) {
                        cnt++;
                    }
                }
            }
            System.out.println(numm + " " + cnt);
        }

    }
}
