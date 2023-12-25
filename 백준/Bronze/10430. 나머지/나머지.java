import java.io.*;

class Main{
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); // 문자열 S입력
        // 공백을 기준으로 문자열을 분리하여 문자열 배열로 만듭니다.
        String[] strArray = str.split(" ");

        // int 배열을 선언하여 문자열 배열을 int로 변환하여 담습니다.
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        int a = intArray[0];
        int b = intArray[1];
        int c = intArray[2];
        System.out.println((a+b)% c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)* (b%c))%c);
    } 
}