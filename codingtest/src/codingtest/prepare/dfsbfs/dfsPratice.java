package codingtest.prepare.dfsbfs;

import java.util.Stack;
import java.util.Arrays;

public class dfsPratice {

    static int answer;
    static int target;
    static int[] numbers;

    public static void main(String[] args) {
        //int[] numbers = {1,1,1,1,1};
        numbers = new int[]{4, 1, 2, 1};
        //int[] numbers= {3,4,2,1};
        target = 4;

       dfs(0, 0);
        System.out.println(answer);
    }

    public static void dfs(int index, int sum) {


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
