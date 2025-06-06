import java.io.*;

public class Q9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringBuilder sb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            if(n == -1) break;

            sb.append(n + " = 1");
            int sum = 1;
            for(int i = 2; i < n; i++){
                if(n%i == 0){
                    sb.append(" + " + i);
                    sum+=i;
                }
            }

            if(n == sum){
                System.out.println(sb);
            }
            else{
                System.out.println(n + " is NOT perfect.");
            }
        }
        br.close();
    }
}
