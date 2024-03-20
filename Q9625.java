import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9625 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        int[] arr = new int[47];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < 47; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[K - 1] + " " + arr[K]);

    }
}
