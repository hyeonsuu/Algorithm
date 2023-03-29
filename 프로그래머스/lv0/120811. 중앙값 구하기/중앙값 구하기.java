import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        return array[array.length / 2];
    }
}