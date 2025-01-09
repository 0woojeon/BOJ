import java.io.*;
import java.util.*;
public class Q1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int x = 1; // 분자
        int y = 1; // 분모
        int dir = 1; 

        if (n>= 1 && n<=10000000){
            for (int i = 1; i < n; i++) {
                if (dir == -1) { 
                    if (y == 1) { 
                        dir = 1;
                        x++;
                    } else { 
                        x++;
                        y--;
                    }
                } else { 
                    if (x == 1) { 
                        dir = - 1;
                        y++;
                    } else {
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
