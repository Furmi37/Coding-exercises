import java.util.HashMap;
import java.util.Map;

public class Dominator {
    public int solution(int[] A) {
        // Implement your solution here
        Map<Integer, Integer> count = new HashMap<>();

        int len = A.length;
        int index = 0;

        for (int a : A){
            count.put(a, count.getOrDefault(a,0)+1);

            if (count.get(a) > len/2) return index;
            index++;
        }
        return -1;
    }
}
