import java.io.*;
import java.util.*;

public class Q1934 {
    public static void main(String args[]) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      for (int i=0; i<N; i++) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          int A = Integer.parseInt(st.nextToken());
          int B = Integer.parseInt(st.nextToken());
          
          System.out.println(cal(A, B));
      }
    }
    
    // 최소공배수 = (A * B) / A와B의 최대공약수
    public static int cal(int A, int B) {
        int max = A > B ? A : B;
        int min = A < B ? A : B;
        int r = -1;
        // 최대공약수 구하기 (max)
        while (true) {
            // 나머지가 0이면 반복문 종료료
            if (r == 0) 
                break;
            
            r = max % min;
            max = min;
            min = r;
        }
        return (A * B) / max;
    }
}