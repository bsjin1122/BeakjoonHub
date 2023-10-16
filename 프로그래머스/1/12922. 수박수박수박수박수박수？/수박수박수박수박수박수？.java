/* 수박수박수박수? */
class Solution {
    public String solution(int n) {
        String answer = "";
        char su = '수';
        char bak = '박';
        for(int i = 1; i<n+1; i++){
            if(i % 2 == 1){
               answer += "수"; 
            }else{
                answer += "박";
            }
        }
        return answer;
    }
}