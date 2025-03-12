package codingtest.prepare.test;

import java.util.Stack;

public class KMCodingTest3 {
    public static void main(String[] args) {
        int N = 3 ;
        int[] A  = {1,2,1,3};
        int[] B  = {2,4,3,4};
        int M = A.length;
        int[][] arr = new int[M][2];
        boolean[][]chk = new boolean[M][2];
        boolean result = false;

        for(int i =0 ;i < M ; i++) {
            arr[i][0] = A[i];
            arr[i][1] = B[i];
        }

         result = getPath(arr,chk, 0,1, N, M);

        System.out.println(result);
    }

    public static boolean getPath(int[][] arr, boolean[][]chk,int i, int result, int N,int M) {
        //종료 조건

        if(result == N &&  i == M) {
            return true;
        }

        System.out.println("result = " + result);

       boolean returnValue = false;
        for(int a = 0 ; a< M ; a++) {
           for(int b = 0 ; b< 2; b++) {
               if(arr[a][b] == result && !chk[a][b]) {
                   System.out.println("arr" + a+","+b+"=" +arr[a][b]);
                    if(b == 0 ) {

                        chk[a][0] = true;
                        getPath (arr,chk, i++, arr[a][1] , N, M);
                    }
                    else {

                        chk[a][1] = true;
                        getPath (arr,chk, i++, arr[a][0] , N, M);
                    }
                   }
               }
           }

        return returnValue;
    }

}
