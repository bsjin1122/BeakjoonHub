/* 나머지가 1이 되는 수 찾기 */
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =1; i<n; i++){
            if(n % i == 1){
                answer = i;
                break; // 두번째 해당되는 값을 막고자 break문으로 종료함
            }
        }
        return answer;
    }
}