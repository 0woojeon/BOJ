import java.io.*;
import java.util.*;
public class Q2587{
public static void main(String[] args)throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] listArr = new int[5];
    int sum = 0;
    int avg = 0;

    for(int i=0; i<listArr.length; i++){
        listArr[i] = Integer.parseInt(br.readLine());
    }
    Arrays.sort(listArr);
    for(int i=0; i<listArr.length;i++){
        sum += listArr[i];
        avg = sum/listArr.length;
    }
    System.out.println(avg);
    System.out.println(listArr[listArr.length/2]);
    br.close();
    }
}