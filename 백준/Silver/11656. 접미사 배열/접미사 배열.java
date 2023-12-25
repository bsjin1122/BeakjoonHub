import java.util.*;
import java.io.*;

class Main{
       public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 문자열 S입력
        List<String> arrList = new ArrayList<>();

        for(int i = 0; i < str.length(); i++){
            arrList.add(str.substring(i)); // 문자열을 잘라서 arrayList에 넣는다.
        }

        Collections.sort(arrList); // 알파벳 순으로 정렬

        for(String string : arrList){ // 출력
            System.out.println(string);
        }
    }
}