package 피보나치의수;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] pivo = new int[100001];
        
        for(int i = 2; i <= n; i ++) {
        	pivo[0] = 0;
        	pivo[1] = 1;
        	
        	pivo[i] = ((pivo[i-1] % 1234567) + (pivo[i-2] % 1234567)) % 1234567; 
        	
        };
        
        return pivo[n];
    }
    
}

//  핵심 
//  (A + B) % C = (( A % C ) + ( B % C )) % C
//  int의 범위는 한정되어있기 때문에 그 범위 안에서 해결해야함
