package codingtest.prepare.sort;

import java.util.Arrays;

/**
 * 정렬 실전 문제(1)
 * 위에서 아래로
 *
 * 수를 큰수부터 작은 수 순서로 내림정렬
 */
public class PraticeSort {
    static int[] arr = {27,15,12};

    static int maxlen = arr.length;
    static int n = 3;

    public static void main(String[] args) {
        int tmp = 0;
        Arrays.stream(arr).forEach(
                (index) -> {
                    for(int i =0 ; i<maxlen; i++) {

                        if(arr[index] > arr[index+i]) {
//                            tmp = arr[index+i];
//                            arr[index+i] = arr[index];
//                            arr[index] = tmp;
                        }

                    }
                }
        );
    }
}
