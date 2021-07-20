package 땅따먹기;


class Solution {
    int solution(int[][] land) {
        int answer = 0;

        for(int i = 0; i < land.length; i++) {
        	for(int j =0; j < land[i].length; j++) {
        		if(land[i][j] < land[i][j]) {
        			
        		}
        	}
        }

        return answer;
    }
}



public class programers_ground {

	public static void main(String[] args) {
		int[][] a = {{1, 2, 3, 5},{5, 6, 7, 8},{4, 3, 2, 1}};
		
		Solution s = new Solution();
		s.solution(a);
		
		
	}

}
