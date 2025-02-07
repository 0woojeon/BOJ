import java.io.*;
import java.util.*;

public class Q1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dayarray = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] montharray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int result = day;
        for(int i = 0; i < month - 1; i++) {
            result += montharray[i];
        }

        System.out.println(dayarray[result % 7]);
    }
}