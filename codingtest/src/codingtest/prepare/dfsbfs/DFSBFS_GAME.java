package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DFSBFS_GAME {
    static int[][] rectangle = {{1, 1, 7, 4}, {3, 2, 5, 5}, {4, 3, 6, 9}, {2, 6, 8, 8}};
    static int characterX = 1, characterY = 3; //캐릭터 위치
    static int itemX = 7, itemY = 8; //목표 위치
    static int arr[][];
    static int answer =0 ;
    static int X =0 ;
    static int Y =0 ;

    static int[] _x = {-1, 1, 0, 0};
    static int[] _y = {0, 0, -1, 1};
    public static void main(String[] args) {
        //가장 짧은 경로 구하기
        arr = new int[101][101];
        answer = 99999;
        X = itemX*2;
        Y = itemY*2;

        for(int r=0; r<rectangle.length; r++){
            int x1 = rectangle[r][0]*2, y1 = rectangle[r][1]*2, x2 = rectangle[r][2]*2, y2 = rectangle[r][3]*2;

            for(int i=x1; i<=x2; i++){
                arr[i][y1] = 1;
                arr[i][y2] = 1;
            }
            for(int j=y1; j<=y2; j++){
                arr[x1][j] = 1;
                arr[x2][j] = 1;
            }
        }

        for(int i=2; i<101; i++){
            for(int j=2; j<101; j++){
                if(arr[i][j]==0){ continue; }
                for(int r=0; r<rectangle.length; r++){
                    int x1 = rectangle[r][0]*2, y1 = rectangle[r][1]*2, x2 = rectangle[r][2]*2, y2 = rectangle[r][3]*2;
                    if(x1<i&&i<x2&&y1<j&&j<y2){ arr[i][j] = 0; }
                }
            }
        }
        findRange(characterX*2, characterY*2, 0);

        System.out.println(answer/2);
    }




    public static void findRange(int x, int y, int go){
        if(x==X&&y==Y){
            if(go<answer){ answer = go; }
            return;
        }
        arr[x][y] = 0;
        for(int v=0; v<4; v++){
            int n_x = x+_x[v], n_y = y+_y[v];
            if(1<n_x&&n_x<101&&1<n_y&&n_y<101&&arr[n_x][n_y]==1){
                findRange(n_x, n_y, go+1);
            }
        }
        arr[x][y] = 1;
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