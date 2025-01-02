import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1292 {
    public static void main(String[] args) throws Exception {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
		StringTokenizer st = new StringTokenizer(br.readLine());

		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		int count = 0; 
		int result = 0; 

		for(int i=1;i<=num2;i++) { 
			for(int j=1;j<=i;j++) { 
				count++;

				if(num1<=count && count<=num2) { 
					result += i; 
					
				}
			}
		}

		System.out.println(result);

	}
}
