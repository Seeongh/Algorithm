package codingtest.prepare.dfsbfs;

public class dfsPratice2 {
    static int[][] arr ={{0,0,1,1,0},
                         {0,0,0,1,1,},
                         {1,1,1,1,1,},
                         {0,0,0,0,0}
    };

    static int n = arr.length;
    static int m = arr[0].length;
    static boolean[][] chk = new boolean[n][m];
    public static void main(String[] args) {


        int result = 0;
        for(int i = 0 ; i < n; i++) {
           for(int j =0  ;j < m ; j ++) {
               if(!chk[i][j]) {
                   result += getIce(i,j, 0);
               }
           }
        }

        System.out.println(result);

    }

    public static int getIce(int x, int y, int sum) {

        if( x < 0  || x == n || y < 0 || y == m ) {
            return sum;
        }
        else if(chk[x][y]) {
            return sum;
        }


        chk[x][y] = true;

        if(arr[x][y] == 0) {
            sum = 1;
            System.out.println("x= " + x +" y="+ y);
            getIce(x-1, y,  sum) ; //위
            getIce(x+1, y, sum) ; //아래
            getIce(x, y-1, sum) ; //좌
            getIce(x, y+1, sum) ; //우
        }

        return sum;

    }
}
