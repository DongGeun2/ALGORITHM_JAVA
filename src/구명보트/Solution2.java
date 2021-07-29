package 구명보트;

import java.util.Arrays;


class Solution2 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int a = 0;
        int b = people.length - 1;
        
        while(a < b) {
        	
        	if(people[a] + people[b] <= limit) {
        		a++;
        	}
        	b--;
        	
        }
        
        
        return people.length - a;
    }
    
    public static void main(String[] args) {
    	Solution2 a = new Solution2();
    	
    	
    	System.out.println(a.solution(new int[]{70, 50, 80, 50}, 100));   // 3
    	
    	System.out.println(a.solution(new int[]{70, 80, 50}, 100));   // 3
    	System.out.println(a.solution(new int[]{40, 50, 60, 90}, 100)); // 3
    
    	System.out.println(a.solution(new int[]{160, 150, 140, 60, 50, 40}, 200)); //3
    	
    	
	}
}
