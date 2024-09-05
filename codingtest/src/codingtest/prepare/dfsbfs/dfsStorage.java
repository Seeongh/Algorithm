package codingtest.prepare.dfsbfs;

import java.util.Stack;

public class dfsStorage {
    static int n = 4, m = 5;
    /**
     * 음료 얼려먹기 다른 방식으로 풀어보기
     * @param args
     */
    public static void main(String[] args) {
        int[][] arr ={{0,0,1,1,0},
                     {0,0,0,1,1,},
                     {1,1,1,1,1,},
                     {0,0,0,0,0}
        };
        boolean[][] chk = new boolean[n][m];
        int cnt = 0;
        //0은 칸막이가 없어 물이 합쳐짐 덩어리 개수 구하기
        Stack<Integer> stackInt = new Stack<>();
        //dfs선택.
        // 노드를 넣고 해당 노드가 0이면 다음 행을 확인
        // 다음행이 1이면 해당행을 빼고 다음 열을 확인
        for(int i =0 ; i<n; i++){
            for(int j =0 ; j<m; j++){
                //반복문
                if(chk[i][j]==false) { //방문한곳이 아니면 진행
                    cnt+= getIce(arr, i,j, 0);
                }

            }
        }

        System.out.println(cnt);


    }
    public static int getIce(int[][] arr, int i, int j,  int stackcnt) {
        int total = 0;

        if(i <= -1 || i >= n || j <= -1 || j >= m ) {
            return stackcnt;
        }

        if(arr[i][j] ==0) {
            arr[i][j] = 1; //방문처리
            //상, 하 , 좌, 우도 확인
            getIce(arr, i-1,j,stackcnt);
            getIce(arr, i,j-1,stackcnt);
            getIce(arr, i+1, j , stackcnt);
            getIce(arr, i, j+1, stackcnt);
            stackcnt = 1;
        }

        return stackcnt;
    }
}
