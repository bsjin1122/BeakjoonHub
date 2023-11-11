/*기능 개발*/
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = countDays(progresses, speeds); // countDays: 몇일간 작업일 필요한지 반환하는 메서드
        ArrayList<Integer> funcArray = funcCount(arr); // funcCount: 배포 기능수 반환하는 메서드
        int[] answer = funcArray.stream().mapToInt(Integer::intValue).toArray(); // arrayList를 int[]로 변환
        return answer;
    }
    
    public static ArrayList<Integer> countDays(int[] p, int[] s){
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i = 0; i < p.length; i++){
            int minus = 100 - p[i]; 
            if(minus % s[i] == 0){
                arrList.add(minus / s[i]);
            }else{
                arrList.add((minus / s[i]) + 1);
            }
        }
        return arrList;
    }
    public static ArrayList<Integer> funcCount(ArrayList<Integer> arr){
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;
        // [5, 10, 1, 1, 20, 1]
        for(int i = 0; i < arr.size(); i++){
             if(stack.isEmpty()){ // 스택이 비어있을 때
                stack.push(arr.get(i)); 
                continue;
            }
            if(!stack.isEmpty()){ // 비어있지 않을 때 
                if(arr.get(i) > stack.elementAt(0)){ // 현재 인덱스값과, stack의 첫번째 값을 비교해서 같거나 크면
                    while(stack.size() > 0){  // 스택 비워내기
                        stack.pop();
                        count++; // count로 pop할 때마다 세기
                    }
                    arrayList.add(count);
                    count = 0;
                    stack.push(arr.get(i));
                    if(i == arr.size()-1){ // 만약 마지막 인덱스 방일 경우 pop할 필요 없이 바로 스택 size값만큼 반환
                        arrayList.add(stack.size());
                        break;
                    }
                }else if(arr.get(i) <= stack.elementAt(0)){
                    stack.push(arr.get(i));
                    if(i == arr.size()-1){
                        arrayList.add(stack.size());
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}