package codingtest.prepare.dfsbfs;

import java.sql.SQLOutput;
import java.util.Stack;

public class dfsbfsStorage {
    static int n = 4, m = 5;
    /**
     * 음료 얼려먹기
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
                    System.out.println("arr"+i+","+j+":"+ arr[i][j]);
                   cnt+= getIce(arr, i,j,chk, stackInt, 0);
                    System.out.println(cnt);
                }

            }
        }

        System.out.println(cnt);


    }
    public static int getIce(int[][] arr, int i, int j, boolean[][] chk, Stack<Integer> stackInt,  int stackcnt) {
        int total = 0;

        System.out.println("?"+stackcnt);
        if((i == n-1 && j == m -1)){
            chk[i][j] = true; // 방문처리
            if(arr[i][j] ==1)return stackcnt;
            return 1;
        }

        if(arr[i][j] ==1) { //1이거나 보낸값이 chk된 경우

            if(stackInt.empty()) {
                //모든 0 을 참조하였으면 return
                return stackcnt;
            }

            //가장 최근에 0 이있던 자리
             total= stackInt.pop();
             i = total/10;
             j = total%10;
            if(i == n-1) {
                getIce(arr, i, j+1, chk, stackInt, stackcnt);
            }
            else {
                getIce(arr,i+1,j , chk, stackInt, stackcnt);
            }

        }
        else if(arr[i][j] == 0 ) {
            stackInt.push((i*10)+j); //0일때 몇번째 배열인지 넣음
            stackcnt=1;
            if(j==m-1) {//제일 끝
                getIce(arr,i+1,j , chk, stackInt, stackcnt);
            }
            else if(j != m-1 && chk[i][j] ==false){
                getIce(arr, i, j+1, chk, stackInt, stackcnt);
            }

        }

        chk[i][j] = true; // 방문처리

        return stackcnt;
    }
}
