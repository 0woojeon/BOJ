import java.io.*;
import java.util.*;
public class Q1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x = 1; // 분자
        int y = 1; // 분모
        int dir = 1; // 1일 때는 위쪽으로, -1일 때는 아래쪽으로

        if (n>= 1 && n<=10000000){
            for (int i = 1; i < n; i++) {
                if (dir == -1) { // 위쪽으로 이동
                    if (y == 1) { // 분모가 1이면 방향 전환
                        dir = 1;
                        x++;
                    } else { // 분자로 이동
                        x++;
                        y--;
                    }
                } else { // 아래쪽으로 이동
                    if (x == 1) { // 분자가 1이면 방향 전환
                        dir = - 1;
                        y++;
                    } else { // 분모로 이동
                        x--;
                        y++;
                    }
                }
            }
    
            System.out.println(x + "/" + y);
        }
       else{
        System.out.println("올바른 값을 넣으시오");
       }
        


    }
}
