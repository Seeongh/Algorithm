package codingtest.prepare.dfsbfs;

import java.util.Stack;
import java.util.Arrays;

public class dfsPratice {

    static int answer;
    static int target;
    static int[] numbers;

    static int[][] maps;
    static boolean[][] chk;
    static int n, m ;
    static int end = 0;
    static Stack<Integer> stack= new Stack<Integer>();

    public static void main(String[] args) {
        maps = new int[][]{{1,1,1,0,0,0}, {1, 0, 1, 0, 1,0}, {1, 0, 1, 1, 1,1}, {0, 1, 1, 1, 0,1}};
        n = maps.length;
        m = maps[0].length;

        chk = new boolean[n][m];

        //y축 index, x축 index
        dfs(0,0);

        answer = stack.size();
        if(answer == 0 ) answer = -1;
        //if(maps[n-1][m-1] != 0) answer = -1;
        System.out.println(answer);
    }

    public static void dfs(int i, int j) {
        //제약 조건
        if(end == 1|| i <0 || i== n || j<0 || j ==m ){
            return ;
        }

        if(!chk[i][j]) {

            System.out.println("들어온  " + i+" , " + j);
            chk[i][j] = true;
            //수행 동작
            if(maps[i][j] == 0) {
                int tmp= stack.pop();
                i = tmp/10;
                j = tmp%10;
                System.out.println("pop or stay : " + i+", " + j);
            }

                stack.push(i * 10 + j);

            if((i == (n-1)) && (j== (m-1))) {
                System.out.println("end");
                end = 1;
            }
            //오른쪽, 아래, 위, 왼쪽 가면서 확인
            dfs(i, j+1);
            dfs(i+1, j);
            dfs(i-1, j);
            dfs(i, j-1);
        }


    }
    //경우의 수

    public void Solution2() {
        //int[] numbers = {1,1,1,1,1};
        numbers = new int[]{4, 1, 2, 1};
        //int[] numbers= {3,4,2,1};
        target = 4;

        dfs2(0, 0);
        System.out.println(answer);
    }

    public static void dfs2(int index, int sum) {


        if(index == numbers.length) {
            if(target == sum ) {
                answer++;
            }
            return;
        }

        dfs(index + 1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
}
