package 체육복;


class Solution_sportswear {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        int count = 0;
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -2;
                    reserve[j] = -2;
                }
            }
        }
        for(int i = 0; i < lost.length; i++) {
            if(lost[i] == -2) {
                count ++;
            }
        }
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(lost[i] - 1 == reserve[j]) {
                    count ++;
                    lost[i] = -2;
                    reserve[j] = -2;
                }else if(lost[i] + 1 == reserve[j]) {
                    count ++;
                    lost[i] = -2;
                    reserve[j] = -2;
                }
            }
        }
        
        return answer + count;
    }
}

public class programers_sportswear {

    public static void main(String[] args) {
        int[] lost = new int[]{2, 4};
        int[] lost2 = new int[]{3};
        int[] reserve = new int[] {1,3,5};
        int[] reserve2 = new int[] {3};
        int[] reserve3 = new int[] {1};
        
        int[] a = {1,2,3};
        int[] b = {4};
        
        Solution_sportswear s = new Solution_sportswear();
     
        
        System.out.println(s.solution(5,new int[]{2,4} ,new int[]{1,3,5}));
        System.out.println(s.solution(5,new int[]{2,4} ,new int[]{3}));
        System.out.println(s.solution(3,new int[]{3} ,new int[]{1}));
    }

}
