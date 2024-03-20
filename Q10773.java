import java.util.*;

public class Q10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int result = 0;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < K; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        for (int j : stack) {
            result += j;
        }
        System.out.println(result);
    }
}
