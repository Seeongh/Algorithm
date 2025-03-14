package codingtest.prepare.dfsbfs;

import java.util.Queue;
import java.util.Stack;

public class BFSICEGAME {

    static int n , m ;
    static int[][] arr;
    public static void main(String[] args) {
        arr = new int[][]{{0, 0, 1, 1, 0},
                         {0, 0, 0, 1, 1},
                        {1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0}};
        n = arr[0].length;
        m = arr.length;
        int result = 0 ;

        for(int i =0 ; i < m; i++) {
            for(int j =0 ; j < n ; j++) {
                if(dfs(i,j)) {
                    result ++ ;
                }
            }
        }

        System.out.println(result);

    }

    public static boolean dfs(int i, int j) {
        //종료 조건
        if(i < 0 || i == n || j < 0 || j == m) {
            return false;
        }

        if(arr[i][j] == 0) {

            System.out.println("i = " + i + " j =" + j);
            arr[i][j] = 1;

            dfs(i+1, j) ;
            dfs(i-1, j) ;
            dfs(i, j+1);
            dfs(i, j-1);
            return true;
        }


        return false;
    }
}
