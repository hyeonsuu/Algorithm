import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
         int[] answer = new int [numbers.length];
        
        for(int i=0; i < numbers.length; i++) {
             System.out.println(numbers[i]);
             answer[i] = numbers[i] * 2;
        }
        System.out.println(answer);
        return answer;
    }
}