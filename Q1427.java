import java.util.*;

public class Q1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String num = sc.next();
        String[] narr = num.split("");
        int arr[] = new int[narr.length];
        
        for (int i = 0; i < narr.length; i++) {
            arr[i] = Integer.parseInt(narr[i]);
        }

        Arrays.sort(arr);

        for (int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
        
        

    }
}
