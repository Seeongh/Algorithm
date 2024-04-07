package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class tmpnode {
    int i;
    int j ;

    public tmpnode(int i , int j) {
        this.i = i;
        this.j = j;
    }
    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return this.j;
    }

    public void setJ(int j) {
        this.j = j;
    }

}
public class dfsPratice {

    static int answer;
    static int target;
    static int[] numbers;

    static int[][] maps;
    static boolean[]chk;
    static int n, m ;
    static int end = 0;
    static Stack<tmpnode> stack= new Stack<>();

    public static void main(String[] args) {
        //maps = new int[][]{{1,1,1,0,0,0}, {1, 0, 1, 0, 1,0}, {1, 0, 1, 1, 1,1}, {0, 1, 1, 1, 0,1}};
//        maps = new int[][] {{1, 1, 0,0},
//                            {1, 1, 0, 1}, //1,3
//                            {0, 0, 1, 0},
//                            {0, 1, 0, 0}  };

        maps = new int[][] {{1, 1, 0, 1},
                            {1, 1, 0, 0}, //1,3
                            {0, 0, 1, 0},
                            {1, 0, 0, 0}};
        n = maps.length;
        chk = new boolean[n];
//
//        for(int i = 0; i<maps.length; i++ ){
//            for(int j =0 ; j <maps.length; j++) {
//                if(maps[i][j] != 0 ) {
//                    answer += dfs(i,j);
//                }
//            }
//        }

        for(int i =0 ; i<maps.length; i++) {
            if(!chk[i]) {
                answerdfs(i);
                answer++;
            }
        }

        //if(maps[n-1][m-1] != 0) answer = -1;
        System.out.println(answer);
    }

    public static void answerdfs(int i) {
        chk[i] = true;

        for(int j = 0; j < n ; j ++ ) {
            if(!chk[j] && maps[i][j] == 1) {
                answerdfs(j);
            }
        }

    }
    public static int dfs(int i, int j) {
        //제약 조건
        if(  (i < 0) || (i == n) || (j < 0) || (j == n) ){
            return 0 ;
        }

        if(maps[i][j] == 1) {
            maps[i][j] = 0;
            System.out.println("1인 i이랑 j :" + i+"," + j);
            //오른쪽, 아래, 위, 왼쪽 가면서 확인
            dfs(i, j+1);
            dfs(i+1, j);
            dfs(i-1, j);
            dfs(i, j-1);

            return 1;
        }

        return 0;
    }


    //경우의 수

    public void Solution2() {
        //int[] numbers = {1,1,1,1,1};
        numbers = new int[]{4, 1, 2, 1};
        //int[] numbers= {3,4,2,1};
        target = 4;

        dfs2(0, 0);
        System.out.println(answer);
    }

    public static void dfs2(int index, int sum) {


        if(index == numbers.length) {
            if(target == sum ) {
                answer++;
            }
            return;
        }

        dfs(index + 1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
}

