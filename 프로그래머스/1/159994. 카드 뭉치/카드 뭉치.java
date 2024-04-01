
import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
    
        ArrayDeque<String> cardsDeque1 = new ArrayDeque<>(Arrays.asList(cards1));
        ArrayDeque<String> cardsDeque2 = new ArrayDeque<>(Arrays.asList(cards2));
        ArrayDeque<String> goalDeque = new ArrayDeque<>(Arrays.asList(goal));
        
        
        while(!goalDeque.isEmpty()){
            if(!cardsDeque1.isEmpty() && cardsDeque1.peekFirst().equals(goalDeque.peekFirst())){
                cardsDeque1.pollFirst();
                goalDeque.pollFirst();
            }else if(!cardsDeque2.isEmpty() && cardsDeque2.peekFirst().equals(goalDeque.peekFirst())){
                cardsDeque2.pollFirst();
                goalDeque.pollFirst();
            }
            else
                break; // 일치하지 않는 원소 찾지 못했으므로 종료 
            
        }
       return  goalDeque.isEmpty() ? "Yes": "No";
    }
}