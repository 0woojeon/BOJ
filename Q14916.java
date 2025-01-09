import java.util.*;
import java.io.*;
public class Q14916 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = 100000;
        int total = 0;

        for(int i = n/5; i>=0;i--){
            int rest = n-5*i;

            if (rest %2 ==0){
                total = i+(rest/2);
                if (min > total)
                min = total;
            }
        }

        if (min == 100000) {
            System.out.println(-1);
        }
        else
        System.out.println(min);
       
    }   
}
