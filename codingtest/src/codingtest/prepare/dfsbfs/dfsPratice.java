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
    static boolean[][] chk;
    static int n, m ;
    static int end = 0;
    static Stack<tmpnode> stack= new Stack<>();

    public static void main(String[] args) {
        //maps = new int[][]{{1,1,1,0,0,0}, {1, 0, 1, 0, 1,0}, {1, 0, 1, 1, 1,1}, {0, 1, 1, 1, 0,1}};
//        maps = new int[][] {{1, 1, 0, 0},
//                            {1, 1, 1, 0},
//                            {0, 0, 1, 0},
//                            {0, 0, 0, 1}};

        maps = new int[][] {{1, 1, 0},
                            {1, 1, 0},
                            {0, 0, 1}};
        n = maps.length;
        Queue<tmpnode> queue = new LinkedList<>();

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};


        for(int a =0; a<n; a++) {
            for(int b =0 ; b<n; b++) {
                if(maps[a][b] != 0 ) {
                    queue.offer(new tmpnode(a,b));
                    System.out.println("처음 1: " + a+", " + b);
                    while(!queue.isEmpty()) {
                        tmpnode t = queue.poll();
                        int x = t.getI();
                        int y = t.getJ();

                        if(maps[x][y] == 1) {
                            maps[x][y] = 0;
                            for(int i = 0; i<4; i++) {
                                int nx = x + dx[i] ;
                                int ny = y + dy[i] ;

                                if( nx < 0  || ny < 0 || nx == n || ny == n) continue;
                                if(maps[nx][ny] == 0 ) continue;
                                if(maps[nx][ny] == 1) {
                                    maps[nx][ny]  = 0 ;

                                    queue.offer(new tmpnode(nx,ny)) ;
                                }
                            }
                            answer++;
                        }

                    }
                }
            }
        }

        //if(maps[n-1][m-1] != 0) answer = -1;
        System.out.println(answer);
    }

    public static int dfs(int i, int j) {
        //제약 조건
        if(  (i < 0) || (i == n) || (j < 0) || (j == n) ){
            return 0 ;
        }

        if(i==2 && j == 3) {
            System.out.println("잉? "+ maps[i][j]);
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

