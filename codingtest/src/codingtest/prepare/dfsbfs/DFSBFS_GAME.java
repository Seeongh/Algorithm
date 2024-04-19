package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

public class DFSBFS_GAME {
    public static void main(String[] args) {
        //가장 짧은 경로 구하기
        int[][] rectangle = {{1, 1, 7, 4}, {3, 2, 5, 5}, {4, 3, 6, 9}, {2, 6, 8, 8}};
        int characterX = 1, characterY = 3; //캐릭터 위치
        int itemX = 7, itemY = 8; //목표 위치

        int[] dx = {1, 0, 1, 0}; //x= 좌우
        int[] dy = {0, 1, 0, 1}; //y= 위아래

        Queue<gameNode> q = new LinkedList<>();
        q.offer(new gameNode(characterX, characterY));

        while (!q.isEmpty()) {
            gameNode tmp = q.poll();

            for (int a = 0; a < 4; a++) { //위아래양옆 4번
                int nx = tmp.i + dx[a];
                int ny = tmp.j + dy[a];

                if(nx<0||ny<0) continue;
                if() continue;
                if(rectangle)
            }
        }
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