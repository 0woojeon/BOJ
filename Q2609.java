import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2609 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
		
        
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
    
        int gcd = getGCD(n1, n2); 
       
    
        System.out.println(gcd);
        System.out.println(((n1*n2)/gcd));
        
    }

    private static int getGCD(int n1, int n2) {
       
        
        if (n1%n2 == 0) return n2;

	
        return getGCD(n2, n1%n2);
    }
}
