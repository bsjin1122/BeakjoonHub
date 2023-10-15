/* 가운데 글자 가져오기 */
class Solution {
    public String solution(String s) {
        String answer = "";
        int strLength = s.length() ;
        if(strLength == 1 ){
            return s;
        }else if(strLength > 1){
            if(strLength % 2 == 1){
                 // 홀수 길이의 문자열인 경우
                int middleIndex = strLength / 2;
                return s.substring(middleIndex, middleIndex + 1);
            }else{
                // 짝수 길이의 문자열인 경우
                int middleIndex1 = (strLength / 2) - 1;
                int middleIndex2 = strLength / 2;
                return s.substring(middleIndex1, middleIndex2 + 1);
            }
        }
     return answer;
    }
  
}