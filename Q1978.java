import java.io.*;
import java.util.StringTokenizer;

public class Q1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주어진 수 N개
        int N = Integer.parseInt(br.readLine());

        // 소수의 갯수를 파악하기 위한 변수 선언
        int count = 0;

        // 두 번째 줄에서 숫자들을 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 소수 판별 함수
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
