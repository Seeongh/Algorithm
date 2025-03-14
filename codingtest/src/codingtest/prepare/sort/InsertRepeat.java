package codingtest.prepare.sort;

import java.util.Arrays;

public class InsertRepeat {

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
        int tmp =0 ;
        for(int i =1 ;i <arr.length; i++) {
           for(int j = i ; j > 0 ; j--) {
               if(arr[j] < arr[j-1]) { //옮기면서 왼쪽으로 내려감!
                  tmp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = tmp;
               }
           }

        }

        System.out.println(Arrays.toString(arr));
    }
}
