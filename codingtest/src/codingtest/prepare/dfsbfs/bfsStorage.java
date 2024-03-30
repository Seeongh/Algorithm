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
    // 이동할 네 가지 방향 정의 (상, 하, 좌, 우)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) {
        int[][] graph ={{1,0,1,0,1,0},
                     {1,1,1,1,1,1},
                     {0,0,0,0,0,1},
                     {1,1,1,1,1,1},
                     {1,1,1,1,1,1}};

        int x =0 , y= 0;

            // 큐(Queue) 구현을 위해 queue 라이브러리 사용
            Queue<Node> q = new LinkedList<>();
            q.offer(new Node(0, 0));
            // 큐가 빌 때까지 반복하기
            while(!q.isEmpty()) {
                Node node = q.poll();
                x = node.getX();
                y = node.getY();
                // 현재 위치에서 4가지 방향으로의 위치 확인
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    // 미로 찾기 공간을 벗어난 경우 무시
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                    // 벽인 경우 무시
                    if (graph[nx][ny] == 0) continue;
                    // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                    if (graph[nx][ny] == 1) {
                        graph[nx][ny] = graph[x][y] + 1;
                        q.offer(new Node(nx, ny));
                    }
                }
            }
            // 가장 오른쪽 아래까지의 최단 거리 반환
        System.out.println(graph[n - 1][m - 1]);
    }
}

class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
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