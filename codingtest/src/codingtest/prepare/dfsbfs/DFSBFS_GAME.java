package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSBFS_GAME {
    static int[][] rectangle = {{1, 1, 7, 4}, {3, 2, 5, 5}, {4, 3, 6, 9}, {2, 6, 8, 8}};
    static int characterX = 1, characterY = 3; //캐릭터 위치
    static int itemX = 7, itemY = 8; //목표 위치
    public static void main(String[] args) {
        //가장 짧은 경로 구하기
        int len  =0 ;
        //제일 큰수를 구해서 chk의 배열 길이로씀
        for(int i =0; i < rectangle.length; i++) {
            for(int j = 0; j < rectangle.length; j++){
                if(rectangle[i][j] > len) len = rectangle[i][j];
            }
        }

        int[][] chk = new int[len+1][len+1];

        chk[characterX][characterY] = 0;

        int[] dx = {-1, 0, 1, 0}; //x= 좌우
        int[] dy = {0, 1, 0, -1}; //y= 위아래
        Queue<gameNode> q = new LinkedList<>();
        q.offer(new gameNode(characterX, characterY));

        while (!q.isEmpty()) {
            gameNode tmp = q.poll();

            for (int a = 0; a < 4; a++) { //위아래양옆 4번
                int nx = tmp.i + dx[a];
                int ny = tmp.j + dy[a];

                if(nx<0||ny<0||nx>len || ny > len) continue; //범위를 벗어나면 안됨
                if(chk[nx][ny] < chk[tmp.i][tmp.j]) continue;
                
                if(findRange(nx, ny) > 0) {
                    q.offer(new gameNode(nx,ny));
                    chk[nx][ny] = chk[tmp.i][tmp.j] +1;
                }
            }
        }

        for(int i =0 ; i < chk.length ; i++) {
            System.out.println("");
            for(int j = 0 ;j <chk.length; j++) {
                System.out.print(chk[i][j]+" " );
            }
        }

        System.out.println(chk[itemX][itemY]);
    }



    public static int findRange(int x, int y) {

        int[] tmp;
        int result = 0;
        for(int i =0 ;i <rectangle.length; i++) {
            tmp = rectangle[i];
            if( x < tmp[0] ||  x > tmp[2] || y <tmp[1] || y > tmp[3]) continue; //범위에도 안듦
            else{ //범위에는 듦
                if ((x == tmp[0]) ||
                    (x == tmp[2]) ||
                    (y == tmp[1]) ||
                    (y == tmp[3])) { //모서리
                    System.out.println(" "+ x+", " +y);
                    result++;
                }
                else{ //영역
                    result = 0;
                    break;
                }
            }
        }

        return result;

    }
}



class gameNode {
    public int i ; //x축
    public int j ; //y축

    public gameNode(int i , int j ) {
        this.i = i;
        this.j = j;
    }
}