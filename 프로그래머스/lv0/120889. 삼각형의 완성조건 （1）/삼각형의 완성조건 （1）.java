import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int sum = 0;
        
        for(int i=0 ; i< sides.length ; i++) {
			sum += sides[i];
            if(max < sides[i]) {
				max = sides[i];
			}
		}
        System.out.println("sum : " + sum);
        System.out.println("max : " + max);
        
        if(max < sum - max) {
        // 만들 수 있다면
            answer = 1;
        } else {
        // 만들 수 없다면
            answer = 2;
        } 
        return answer;
    }
}