package 나누어떨어지는숫자배열;

class Solution_NUMBER{
    public int[] solution(int[] arr, int divisor) {
        int[] array = new int[arr.length];
        int[] printArr;
        int count = 0;
        int numcount = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                array[i] = arr[i];
                count ++;
            }
        }
        for(int i = 0; i < array.length; i++) {
            for(int j =0; j < array.length; j++) {
                int temp = 0;
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        
        printArr = new int[count];
        if(count > 0) {
            for(int i = 0; i < array.length; i++) {
                    if(array[i] != 0) {
                        printArr[numcount] = array[i];
                        numcount++;
                    }
                }
        }else if (count == 0){
            printArr = new int[] {-1};
        }

        return printArr;
    }
}

public class programers_NUMBER {

    public static void main(String[] args) {
        int[] arr = { 5, 10, 16, 18, 20 };

        Solution_NUMBER s2 = new Solution_NUMBER();      
        int[] a = s2.solution(arr, 6);        
        for(int i : a) {
            System.out.println(i);
        }
       
    }

}
