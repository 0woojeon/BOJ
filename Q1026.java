import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arrA = new int[N];
        int[] arrB = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < N; i++) {
            sum += arrA[i] * arrB[N - 1 - i];
        }
        System.out.println(sum);

    }
}

// BufferedReader가 Scanner에 비해 입력처리속도 , 적은 메모리를 사용하는 장점 가지므로 앞으로 BufferedReader
// 사용하도록 노력 할 것.