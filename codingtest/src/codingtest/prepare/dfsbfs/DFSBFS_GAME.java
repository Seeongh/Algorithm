package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

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
                if(chk[nx][ny] > 0) continue;
                if(findRange(nx,ny,0)) {
                    q.offer(new gameNode(nx,ny));
                    chk[nx][ny] =1;
                    chk[nx][ny] += chk[tmp.i][tmp.j];

//                    if (nx == itemX && ny == itemY) {
//                        q.clear();
//                        break;
//                    }
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


    public static boolean findRange(int x, int y, int i) {
        if(i > rectangle.length) { //끝까지 다 돌았는데 다 중첩됨
            return false;
        }
        int[] tmp = rectangle[i];

        if ((x == tmp[0] && ( y >= tmp[1] && y <= tmp[3])) ||
            (x ==tmp[2] && ( y >= tmp[1] && y <= tmp[3])) ||
            (x == tmp[0] && ( y >= tmp[1] && y <= tmp[3])) ||
            (x ==tmp[2] && ( y >= tmp[1] && y <= tmp[3]))

        ){

                if(findRange(x,y, i+1)) { //중첩거르기
                    return false;
                }

                return true;
            }
        }
        return false;
    }
}



class gameNode {
    int i ; //x축
    int j ; //y축

    gameNode(int i , int j ) {
        this.i = i;
        this.j = j;
    }
}