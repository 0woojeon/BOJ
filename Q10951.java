import java.util.Scanner;

public class Q10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > 9 || b > 9) {
                System.out.println("범위를 초과함");
            } else {
                System.out.println(a + b);
            }

        }

    }
}
