/*전화번호 목록 (정답확인함)*/
import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        //HashMap에 전화번호 문자열 Key 저장 
        for(String phone_number: phone_book){
            map.put(phone_number, 1);
        }
        for(String phone_number: phone_book){
            // ex) [119,1,234] 119일 경우 접두어는 1, 11이다. 
            // 각 전화번호의 접두사는 (문자열 길이-1)개 만큼 존재하며, 이 접두사를 하나씩 확인해야 한다.
            // substing(0, 1) ~ substring(0, length-1)
            for(int j = 1; j < phone_number.length(); j++){
                String prefix = phone_number.substring(0, j);
                if(map.containsKey(prefix)) return false;
            }
        }
        
        return true;
    }
}