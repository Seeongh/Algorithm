package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

class noded {
    int i;
    int j ;

    public noded(int i , int j) {
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
public class bfsPratice {

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

        Queue<noded> queue = new LinkedList<>();
        queue.offer(new noded(0,0)); //최초 노드 삽입

        while(!queue.isEmpty()) {
            noded tmp = queue.poll(); //뺴서
            int x = tmp.getI();
            int y = tmp.getJ();

            //상,하,좌,우 4번 반복
            for(int i =0 ;i <4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                System.out.println("큐에서 뺀값 : " + x+ " ," + y);
                System.out.println("확인한 값 : " + nx+ " ," + ny);

                if(nx < 0 || ny < 0 || nx == n || ny == m)  continue;
                if(maps[nx][ny] == 0) continue;
                if(!chk[nx][ny]) {
                    if(maps[nx][ny] == 1) {
                       // chk[nx][ny] = true;
                        maps[nx][ny] = maps[x][y] +1 ; //이전값 + 1해준다
                        queue.offer(new noded(nx,ny)) ;
                    }
                }
            }
        }

        System.out.println(maps[n-1][m-1]);
    }
}
