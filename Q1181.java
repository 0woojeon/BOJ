import java.io.*;
import java.util.*;

public class Q1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String>wordarr = new HashSet<>(); // 중복없애려고 해쉬셋 사용

        for(int i = 0 ; i < n ; i++) {
            String word = br.readLine();
            wordarr.add(word);
        }

        List<String> sortword = new ArrayList<>(wordarr); // 정렬하기위해서 리스트로 변환 , 해쉬셋은 정렬순서 유지안해서 ArrayList로 변환해줘야함 

        Collections.sort(sortword, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2)
            {
                int comparelength = Integer.compare(s1.length(), s2.length());
            

            if(comparelength==0){ // 비교해서 두 요소 같으면 0 , 두 요소 비교해서 작은게 앞에옴 , s1이 s2 보다 앞에와야하면 음수 , 반대면 양수 
                return s1.compareTo(s2); //compareTo -- 기본적으로 사전 순으로 문자열 비교 
            }
            return comparelength;
        }
    });

    for(String word : sortword){
        System.out.println(word);
    }
}}
        
// 문자열 요소에 따라 비교할 때 Comparator 인터페이스 , 중복 없앨 때 해쉬셋 사용 

    
