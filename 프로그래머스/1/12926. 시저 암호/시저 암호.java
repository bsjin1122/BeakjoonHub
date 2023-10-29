/*시저 암호(답 확인함)*/
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c: s.toCharArray()){
           int asciiValue = 0;
           if(c == ' '){
               answer += c;
               continue;
           }
           if(Character.isLowerCase(c)){
               answer += (char) ((c - 'a' + n) % 26 + 'a');
           }else if(Character.isUpperCase(c)){
               answer += (char) ((c - 'A' + n) % 26 + 'A');
           }
        }
        return answer;
    }
}