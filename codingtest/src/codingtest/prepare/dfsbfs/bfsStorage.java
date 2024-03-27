package codingtest.prepare.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 미로 탈출
 */
public class bfsStorage {

    static int n = 5, m = 6;
    public static void main(String[] args) {
        int[][] arr ={{1,0,1,0,1,0},
                     {1,1,1,1,1,1},
                     {0,0,0,0,0,1},
                     {1,1,1,1,1,1},
                     {1,1,1,1,1,1}};

        Queue<Integer> queue = new LinkedList<>();
        int result = 0;
        int tmp = 0 ;
        for(int i =0 ; i<n; i++) {
            for( int j =0 ; j < m ;j++) {

                if(arr[i][j] == 1) {
                    result ++ ;
                    queue.offer(i*10+j);
                }
                else { //0이면
                    tmp = queue.poll(); //뺴고
                    i = tmp/10 + 1;
                    j = tmp%10;
                }

                if((j= m-1)){
                    tmp = queue.poll(); //뺴고
                    i = tmp/10 + 1;
                    j = tmp%10;
                }
            }
        }
    }

}
