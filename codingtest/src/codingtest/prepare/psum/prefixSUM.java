package codingtest.prepare.psum;

import java.util.Arrays;

/**
 * 배열 첫번째 부터 끝까지 합이 있는 배열 만들기
 * N개의 카드중 a부터 b까지 합을 구하기'
 * 구간쿼리 : 정적배열일떄는 프리픽스썸
 */
public class prefixSUM {

    public static void main(String[] args) {

        int N  = 4; //수의 개수
        int M = 1; //합을 구해야하는 횟수
        int[] arr = {1, 10, 11, 100};
        int a, b = 0 ; //합의 구간

        int[] tmp  = new int[N+1];
        for(int i = 1 ; i < N+1 ; i++) {
            tmp[i] = tmp[i-1] + arr[i-1] ;
        }

        System.out.println(Arrays.toString(tmp));
    }
}
