import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer=0;
        
        List<String> arr=new ArrayList<>();
        for(int i=0;i<want.length;i++){
            for(int j=0;j<number[i];j++){
                arr.add(want[i]);
            }
        }
        
        for(int i=0;i<=discount.length-10;i++){
            
            // 현재 검사 중인 10일 구간을 t리스트에 복사함
            List<String> t = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(discount, i, i+10)));
            
            // arr에 있는 제품들을 t리스트에서 제거
            for(String a : arr){
                t.remove(String.valueOf(a));
            }
            // t리스트가 비어있다면, 해당 구간에 대해 answer를 증가시킨다. 
            if(t.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}

// Arrays.copyOfRange(discount, i, i+10)을 사용하여 discount 배열에서 i부터 시작하는 10일 구간을 잘라내어 t 리스트로 만듭니다.
// arr 리스트에 있는 제품들을 t 리스트에서 제거함으로써 해당 구간에서 정현이가 원하는 제품들을 모두 구매할 수 있는지를 체크합니다.
// 최종적으로 구할 수 있는 구간의 개수를 answer에 저장하고 반환합니다