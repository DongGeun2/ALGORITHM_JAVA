package 구명보트;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList peoples = new ArrayList<>();
        
        Integer[] p = Arrays.stream(people).boxed().toArray(Integer[]::new);
        Arrays.sort(p, Collections.reverseOrder());
        
        
        for(Integer a : p) {
        	peoples.add(a);
        }
        
        int b = 1;
        while(!peoples.isEmpty()) {
        	 
        	if(peoples.size() < 2) {
        		b = 0;
        	}
        	
        	if((int)peoples.get(0) + (int)peoples.get(b) <= limit && b != 0) {
        		
        		peoples.remove(b);
        		peoples.remove(0);
        		answer++;
        		b = 1;
        	}else {
        		b++;
        	}
        	
        	if(b == peoples.size()) {
        		peoples.remove(0);
        		answer++;
        		b = 1;
        	}
        	
        	
        	
        }
        	
        
        return answer;
    }
    
    public static void main(String[] args) {
    	Solution a = new Solution();
    	
    	
    	System.out.println(a.solution(new int[]{70, 50, 80, 50}, 100));   // 3
    	
    	
    	System.out.println(a.solution(new int[]{70, 80, 50}, 100));   // 3
    	System.out.println(a.solution(new int[]{40, 50, 60, 90}, 100)); // 3
    
    	
    	System.out.println(a.solution(new int[]{160, 150, 140, 60, 50, 40}, 200)); //3
    	
    	
	}
}
