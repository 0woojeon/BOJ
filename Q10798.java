import java.io.*;

public class Q10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char arr[][] = new char[5][15];

        // 입력 받기
        for(int i = 0; i < 5; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        StringBuilder result = new StringBuilder();

        // 세로로 읽기
        for(int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != 0) { // arr[i][j]가 유효한 문자일 때
                    result.append(arr[i][j]);
                }
            }
        }

        System.out.print(result.toString()); // 결과 출력
        br.close();
    }
}
