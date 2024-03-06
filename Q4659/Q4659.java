package Q4659;

import java.util.Scanner;

public class Q4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String word = sc.next();
            if (word.equals("end")) {
                break;
            }
            int mcnt = 0;
            int jcnt = 0;
            boolean isAcceptable = true;

            if (!word.contains("a") && !word.contains("e") && !word.contains("i") && !word.contains("o")
                    && !word.contains("u")) {
                isAcceptable = false;
            } else {
                for (int i = 0; i < word.length(); i++) {
                    if (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                        if (word.charAt(i) != 'e' && word.charAt(i) != 'o') {
                            isAcceptable = false;
                            break;
                        }
                    }
                    if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                            || word.charAt(i) == 'u') {
                        mcnt++;
                        jcnt = 0;
                    } else {
                        jcnt++;
                        mcnt = 0;
                    }

                    if (mcnt == 3 || jcnt == 3) {
                        isAcceptable = false;
                        break;
                    }
                }
            }
            if (isAcceptable) {
                System.out.println("<" + word + "> is acceptable.");
            } else {
                System.out.println("<" + word + "> is not acceptable.");
            }
        }
        sc.close();
    }
}