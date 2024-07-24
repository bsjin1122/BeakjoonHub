import java.util.Arrays; 

class Solution {
    public String[] solution(String[] strings, int n) {
          // strings 배열을 n번째 문자를 기준으로 정렬
        Arrays.sort(strings, (a, b) -> {
            // n번째 문자가 같으면 전체 문자열을 알파벳 순으로 비교
            if (a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            } else {
                // n번째 문자가 다르면 그 문자끼리 비교
                return Character.compare(a.charAt(n), b.charAt(n));
            }
        });
        
        // 정렬된 strings 배열 출력
        //System.out.println(Arrays.toString(strings));
        return strings;
    }
}