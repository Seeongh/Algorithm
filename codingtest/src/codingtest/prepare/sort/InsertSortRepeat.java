package codingtest.prepare.sort;

import java.util.Arrays;

public class InsertSortRepeat {
    public static void main(String[] args) {
        int[] arr = {7,5,9,0,3,1,6,2,4,8} ;
        int tmp = 0;
        for(int i = 1; i < arr.length; i++) {
            for(int j =0 ; j<i; j++) {
                 if(arr[j] > arr[i]) {
                     tmp = arr[j];
                     arr[j] = arr[i];
                     arr[i] = tmp;
                 }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
