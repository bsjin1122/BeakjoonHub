import java.util.Arrays;
import java.util.Scanner;

/* 방번호(1475): 
다솜이는 은진이의 옆집에 새로 이사왔다. 
다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. 
(6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)*/

public class Main{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roomNumber = sc.next();
        int[] arr = new int[10]; // 0~9까지의 배열을 index로 사용, 각 인덱스에 해당하는 count를 증가시키는 방법
        for(char c : roomNumber.toCharArray()){
            int num = c - '0';

            if(num == 9){ // 6과 9는 뒤집어 사용 가능
                num = 6; // 6으로 몰아주기
            }

            arr[num]++; // 해당 인덱스의 count 증가
        }
        arr[6] = (arr[6] / 2) + (arr[6] % 2); // count의 값을 반으로 나눈다.
        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}