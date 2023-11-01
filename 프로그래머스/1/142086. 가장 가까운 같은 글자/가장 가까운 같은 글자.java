/*가장 가까운 같은 글자*/
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        ArrayList<Character> arr = new ArrayList<>();
        arr.add(s.charAt(0));
        char[] charArr = s.toCharArray();
        
        for(int i = 1; i < s.length(); i++){
            if(!arr.contains(charArr[i])){
                arr.add(charArr[i]);
                answer[i] = -1;
            }else{
                
                answer[i] = (arr.size()) - arr.lastIndexOf(charArr[i]);
                arr.add(charArr[i]);
            }
           
        }
        return answer;
    }
}