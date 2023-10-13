/* 음양 더하기 */
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i = 0; i < absolutes.length; i++){ // 위의 두 배열의 길이는 같기 때문에 둘 중 하나로 지정 
            if(signs[i] == true){
                answer += absolutes[i];
            }else{
                answer += -absolutes[i];
            }
            
        }
        return answer;
    }
}