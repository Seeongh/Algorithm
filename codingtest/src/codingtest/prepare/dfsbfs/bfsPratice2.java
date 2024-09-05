package codingtest.prepare.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfsPratice2 {

    /**
     * 최단 거리 구하기
     * @param args
     */

    static int[] dx= {-1,1, 0,0};
    static int[] dy= {0,0,-1,1};
    static int n = 5, m = 6;
    public static void main(String[] args) {
        int[][] graph = {{1, 0, 1, 0, 1, 0},
                        {1, 1, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 1, 1}};

        Queue<Node2> q = new LinkedList<>();
        q.offer(new Node2(0,0));

        Scanner sc = new Scanner(System.in) ;
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(b.charAt(2));
        int x =0 , y= 0;

        while(!q.isEmpty()) {
            Node2 node= q.poll();
            x = node.getX();
            y = node.getY();

            //4방향으로 위치확인
            for(int i =0 ; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx == n || ny< 0 || ny == m ) continue;
                if(graph[nx][ny]== 1) {
                    graph[nx][ny] = graph[x][y] + 1;
                    q.offer(new Node2(nx, ny));
                }
            }
        }

        System.out.println(graph[n - 1][m - 1]);
    }
}

class Node2 {
    public int x ;
    public int y ;
    public Node2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}