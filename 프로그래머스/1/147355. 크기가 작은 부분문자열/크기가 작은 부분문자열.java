/* 크기가 작은 부분 문자열 */
// ex 첫번째: 3141592 -> 314 substring 떼어서 arrayList에 넣고 맨 앞 글자 하나씩 지움 
//    두번째: 141592 -> 141 substring 떼어서 arrayList에 넣고 맨 앞 글자 하나씩 지움
//    세번째: 41592 -> 415 substring 떼어서 arrayList에 넣고 맨 앞 글자 하나씩 지움
//    271이 3글자이므로 String t 가 3개가 같거나 클 때까지 반복(글자수가 적어지면 3글자를 추출 못하기 때문)
import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        StringBuffer stringBuffer = new StringBuffer(t);
        ArrayList<Long> arrayList = new ArrayList<>();
        
        while(stringBuffer.length() >= p.length()){
           arrayList.add(Long.parseLong(stringBuffer.substring(0, p.length())));
           stringBuffer.deleteCharAt(0); // 맨앞글자 삭제 
        }
        for(long splitInt: arrayList){
            if(splitInt <= Long.parseLong(p)){ // 같거나 작은 수 비교 
                answer++;
            }
        }

        return answer;
    }
}