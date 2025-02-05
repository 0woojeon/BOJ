import java.io.*;

public class Q1259 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			String S = br.readLine();
			StringBuilder sb = new StringBuilder(S);
			String rev = sb.reverse().toString();
			if(S.equals("0")) break;
			
			if(S.equals(rev)) {
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
			
		}
	}

}