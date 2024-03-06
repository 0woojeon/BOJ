import java.util.Scanner;

public class Q9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rock = sc.nextInt();

        if (rock % 2 == 1) {
            System.out.println("SK");
        } else {
            System.out.println("CY");
        }

    }
}
