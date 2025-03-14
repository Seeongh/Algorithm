package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class BfsPractic2 {
    static int[][] maps;
    static boolean[][] chk;
    static int answer = 0;
    static int n, m ;

    public static void main(String[] args) {

        maps = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        n  = maps.length;
        m = maps[0].length;
        chk = new boolean[n][m];

        int[] dx = {-1,1,0,0}; //위, 아래
        int[] dy = {0,0,-1,1}; // 좌, 우

        Queue<test> queue = new LinkedList<>();
        queue.offer(new test(0,0));

        while(!queue.isEmpty()) {
            test tmp = queue.poll();
            int x = tmp.getI();
            int y = tmp.getJ();

            for(int i =0 ; i<4; i++) {
                int nx = x+ dx[i];
                int ny = y+ dy[i];

                if(nx < 0 || ny < 0 || nx == n || ny == m) continue;
                if(maps[x][y] == 0 ) continue;
                if(!chk[x][y]) {
                    if(maps[nx][ny] == 1) {
                        maps[nx][ny] = maps[x][y] + 1;
                        queue.offer(new test(nx, ny));
                    }
                }
            }
        }


    }
}

class test {
    int i;
    int j ;

    public test(int i , int j) {
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
