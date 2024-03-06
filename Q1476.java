import java.util.Scanner;

public class Q1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int S = sc.nextInt();
        int M = sc.nextInt();

        int ecnt = 0;
        int scnt = 0;
        int mcnt = 0;
        int result = 0;

        while (true) {
            ecnt++;
            scnt++;
            mcnt++;
            result++;

            if (ecnt > 15) {
                ecnt = 1;
            }
            if (scnt > 28) {
                scnt = 1;
            }
            if (mcnt > 19) {
                mcnt = 1;
            }

            if (ecnt == E && scnt == S && mcnt == M) {
                break;
            }

        }
        System.out.println(result);
        sc.close();

    }
}
