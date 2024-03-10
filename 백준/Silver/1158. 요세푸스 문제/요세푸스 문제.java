import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 백준 1158 - 요세푸스 문제는 다음과 같다.
 * 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
 * 이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
 * 이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
 * 예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.
 * N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.
 */

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder(); // 결과를 저장

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>(); // n명의 사람을 넣을 링크드리스트 선언
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        sb.append('<');
        while(!list.isEmpty()) { // 리스트가 빌 때까지 반복
            for (int i = 0; i < k; i++) {
                if (i == k-1) { // 1번 사람 부터 시작하기 때문에 k-1 과 매치한다.
                    if (list.size() == 1) { // 마지막 인원은 쉼표를 제외하고 넣어준다.
                        sb.append(list.remove());
                    } else {
                        sb.append(list.remove()).append(", ");
                    }
                } else {
                    list.add(list.remove());
                }
            }
        }
        sb.append('>');
        System.out.println(sb);

    }
}