/*K번째 수*/
import java.util.*;

class Solution {
    public static int splitSort(int[] array, int[] row){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=row[0]-1; i<= row[1]-1; i++){
            arrayList.add(array[i]);
        }
        Collections.sort(arrayList);
        int returnInt = arrayList.get(row[2]-1);
        arrayList.clear();
        return returnInt;
    }
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int k = 0; k < commands.length; k++){
            answer[k] = splitSort(array, commands[k]);
        }

        return answer;
    }
}