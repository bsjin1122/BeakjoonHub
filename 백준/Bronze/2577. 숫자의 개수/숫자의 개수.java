import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        String value = String.valueOf((A * B * C)); // 세 int 값을 곱한 value를 String으로 바꾼다.
        sc.close();


        for(int i = 0; i <10; i++){
            int count = 0;
            for(int k = 0; k < value.length(); k++){
                if(value.charAt(k)-'0' == i){ // charAt 이 Character 형태라 타입을 맞춰준다.
                    count++;
                }
            }
            System.out.println(count);
        }

	}
}