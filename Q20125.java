import java.util.Scanner;

public class Q20125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[][] cookiearr = new char[num][num];
        int heartx = 0;
        int hearty = 0;
        int lefta = 0;
        int righta = 0;
        int middle = 0;
        int leftl = 0;
        int rightl = 0;
        boolean found = false;

        for (int i = 0; i < num; i++) {
            String cookie = sc.next();
            for (int j = 0; j < num; j++) {
                cookiearr[i][j] = cookie.charAt(j);

                if (!found && i > 0 && cookiearr[i][j] == '*' && cookiearr[i - 1][j] == '*') {
                    heartx = i;
                    hearty = j;
                    found = true;
                }
            }
        }

        for (int i = hearty - 1; i >= 0; i--) {
            if (cookiearr[heartx][i] == '*') {
                lefta++;
            } else
                break;
        }

        for (int i = hearty + 1; i < num; i++) {
            if (cookiearr[heartx][i] == '*') {
                righta++;
            } else
                break;
        }

        int middlex = 0;

        for (int i = heartx + 1; i < num; i++) {
            if (cookiearr[i][hearty] == '*') {
                middle++;
                middlex = i;
            } else {
                break;
            }
        }

        for (int i = middlex + 1; i < num; i++) {
            if (cookiearr[i][hearty - 1] == '*') {
                leftl++;
            } else {
                break;
            }
        }

        for (int i = middlex + 1; i < num; i++) {
            if (cookiearr[i][hearty + 1] == '*') {
                rightl++;
            } else {
                break;
            }
        }

        System.out.println((heartx + 1) + " " + (hearty + 1));
        System.out.println(lefta + " " + righta + " " + middle + " " + leftl + " " + rightl);
        sc.close();
    }
}