import java.util.*;
import java.io.*;

class Main{
     public static void main(String[] args) throws IOException {
        // 입력은 InputStreamReader를 통해 '문자'를 'char'타입으로 byte단위로 받는다(InputStream 객체로)
        // 받은 'char'타입 문자들을 BufferedReader를 통해 직렬화('String'타입으로 변환)한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 문자열을 Intger 데이터타입으로 변환한다.(기본형 String)
        int N = Integer.parseInt(br.readLine());

        // 문자들을 입력받아 String을 만들 StringBuilder선언
        // String은 불변의 객체이기 때문에 새로만들거나 합칠때마다
        // 새로운 문자열을 참조하기에 비효율적이다.
        StringBuilder sb = new StringBuilder();

        // String을 delim(delimiter)으로 분리하여 토큰화합니다.
        // delim으로는 기본적인 공백문자인 \t(가로탭), \n(줄바꿈), \r(캐리지 리턴) 등이 있습니다.
        StringTokenizer st;

        for(int i = 0; i < N; i++) {
            // 공백 기준으로 토큰화(한번에 입력받음)
            st = new StringTokenizer(br.readLine(), " ");

            // String토큰들을 Intger로 형변환
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 정적메소드 gcd 실행결과인 최대공약수를 d변수에 입력
            int d = gcd(a, b);

            // 유클리드 호제법 사용
            // 결과를 StringBuilder에 입력하고 줄바꿈을 붙인다.
            sb.append(a * b / d).append('\n');
        }
        // 반복문 종료후 결과값들이 들어있는 sb출력
        System.out.println(sb);

    }

    // 최대공약수 반복문 방식
    public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b; // 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }
        return a;
    }

}