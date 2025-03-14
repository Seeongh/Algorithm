package codingtest.prepare.sort;

import java.util.Arrays;

public class SelectionRepeat {
    public static void main(String[] args) {
        int[] arr = {7,5,9,0,3,1,6,2,4,8};

        int minIndex =0 ;
        int tmp  = 0 ;

        for(int i =0 ;i <arr.length; i++) {
            minIndex = i;
            //배열에서 제일 작은 수 구하기
            for(int j =i ;j <arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            tmp = arr[i];
            arr[i] = arr[minIndex] ;
            arr[minIndex] = tmp;

        }

        System.out.println(Arrays.toString(arr));


    }
}
