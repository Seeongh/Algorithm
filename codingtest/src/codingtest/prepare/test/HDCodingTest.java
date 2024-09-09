package codingtest.prepare.test;

import java.util.Scanner;

/**
 * 구멍의 개수 N
 * 사용할 수 있는 덮개 수 k
 * 해당 구멍의 위치
 *
 * k의 최소 길이 구하기
 */
public class HDCodingTest {

    static int k = 0 ;
    static int len = 0;
    static int[] arrInd = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();

         arrInd = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arrInd[i] = sc.nextInt();
            if(i == (n-1)) { // 맨 마지막에는 마지막 위치가 온다.
                len = arrInd[i] + 1;
            }
        }

        boolean[] chk = new boolean[len];


        // k의 최소 수 구하기
        // 있는 k를 다 써야 최소 길이를 충족할 수 있음.
        int result = 0 ;
        int i =0 ;
        while(result !=  k) { //찾을 떄 까지 돌림
            result = getMinLen(chk, 0, 0, i++);
        }

        System.out.println("ash 최소 길이 : " + result);

    }

    public static int getMinLen(boolean[] chk, int startInd, int sum, int addNum) {
        System.out.println("ash getMinLen " + startInd + " sum = " + sum +" addNum = " + addNum);
        
         getMinLen(chk, startInd+addNum, sum+1, addNum);


        return sum;
    }

}
