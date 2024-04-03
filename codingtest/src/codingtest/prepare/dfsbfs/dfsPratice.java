package codingtest.prepare.dfsbfs;

import java.util.Stack;

class tmpnode {
    int i;
    int j ;

    public tmpnode(int i , int j) {
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
public class dfsPratice {

    static int answer;
    static int target;
    static int[] numbers;

    static int[][] maps;
    static boolean[][] chk;
    static int n, m ;
    static int end = 0;
    static Stack<tmpnode> stack= new Stack<>();

    public static void main(String[] args) {
        maps = new int[][]{{1,1,1,0,0,0}, {1, 0, 1, 0, 1,0}, {1, 0, 1, 1, 1,1}, {0, 1, 1, 1, 0,1}};
        n = maps.length;
        m = maps[0].length;

        chk = new boolean[n][m];

        //y축 index, x축 index
        dfs(0,0);

        if(!chk[n-1][m-1]) answer = -1;
        //if(maps[n-1][m-1] != 0) answer = -1;
        System.out.println(answer);
    }

    public static void dfs(int i, int j) {
        //제약 조건
        if( end == 1 || i < 0 || i == n || j< 0 || j == m ){
            return ;
        }

        else if((i == (n-1)) && (j== (m-1))){
            chk[i][j] = true;
            answer++;
            end = 1;
            return;
        }

        if(!chk[i][j]) {

            System.out.println("들어온  " + i+" , " + j);
            chk[i][j] = true;

            stack.push(new tmpnode(i,j));

            //수행 동작
            if(maps[i][j] == 0) {
                tmpnode tmpo = stack.pop();
                System.out.println("pop stack  " + tmpo.getI()+" , " + tmpo.getJ());
                return;
            }
            else {
                answer++;
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

