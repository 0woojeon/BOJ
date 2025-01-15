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

        // 세로로 읽기
        for(int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (j < arr[i].length) { // 현재 단어의 길이를 확인
                    System.out.print(arr[i][j]); // 유효한 문자 출력
                }
            }
        }

        br.close();
    }
}
