package codingtest.prepare.test;

public class KMCodingTest {
    public static void main(String[] args) {
        int[] A = {1,2,3};

        int max = getMaxNum(A);
        int[] arr = new int[max+1];
        int result = 0;

        for(int value : A) {
            if(value > 0) {
                arr[value] = 1;
            }
        }

        for(int i =1 ; i < arr.length; i++) {
            if(arr[i] != 1) {
                result = i ;
                break;
            }
        }

        if(result == 0) {
            result = max + 1;
        }

        System.out.println(result);

    }

    public static int  getMaxNum(int[] A) {
        int max = A[0];

        for(int value : A) {
            if(value > max) {
                max = value;
            }
        }

        if(max < 0) {
            max =1; // 배열 0, 1유도
        }

        System.out.println(max);
        return max;
    }
}
