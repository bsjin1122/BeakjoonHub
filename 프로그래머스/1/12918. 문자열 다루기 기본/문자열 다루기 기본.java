/* 문자열 다루기 기본*/
class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6){
            if(s.matches("[0-9]+")){
                answer = true;
            }else{
                answer = false;
            }    
        }else{
            return false;
        }
        
        return answer;
    }
}