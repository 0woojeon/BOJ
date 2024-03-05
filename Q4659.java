import java.util.Scanner;

public class Q4659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String word = sc.next();
            if (word.equals("end")) {
                break;
            }

            int mcnt = 0, jcnt = 0;
            boolean isAcceptable = true;

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
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

                if (i > 0 && word.charAt(i) == word.charAt(i - 1) && c != 'e' && c != 'o') {
                    isAcceptable = false;
                    break;
                }
            }

            if (mcnt == 0 || (word.charAt(word.length() - 1) == word.charAt(word.length() - 2)
                    && word.charAt(word.length() - 1) != 'e' && word.charAt(word.length() - 1) != 'o')) {
                isAcceptable = false;
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