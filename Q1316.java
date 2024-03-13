import java.util.*;

public class Q1316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int groupcnt = 0;

        for (int i = 0; i < N; i++) {
            String words = sc.next();
            boolean[] arr = new boolean[26]; // 알파벳 개수
            boolean check = true;

            for (int j = 0; j < words.length(); j++) {
                int alpcheck = words.charAt(j) - 97; // 아스키코드 a = 97

                if (arr[alpcheck]) {
                    if (words.charAt(j) != words.charAt(j - 1)) { // 이미 등장한 알파벳이 바로 전의 알파벳과 다르다 == 그룹함수 x
                        check = false;
                        break;
                    }
                } else {
                    arr[alpcheck] = true;
                }
            }
            if (check) {
                groupcnt++;
            }
        }
        System.out.println(groupcnt);

    }
}
