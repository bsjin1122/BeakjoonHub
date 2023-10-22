/*이상한 문자 만들기*/
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitString = s.split(" ", -1); //띄어쓰기 단위로 나눔
        for(String str: splitString){ //단어 당 
            for(int i = 0; i< str.length();i++){
                if(i == 0 ){
                    answer += String.valueOf(str.charAt(i)).toUpperCase();
                }else if( i % 2 == 1){ //인덱스 홀짝 비교
                    answer += String.valueOf(str.charAt(i)).toLowerCase(); //char를 String으로 변환 후 처리
                }else if(i % 2 == 0){
                    answer += String.valueOf(str.charAt(i)).toUpperCase();
                }
            }
            answer += " "; 
        }
        answer = answer.substring(0, answer.length()-1); //맨 마지막 단어 뒤에도 공백이 들어가는 현상 제거 
        return answer;
    }
}