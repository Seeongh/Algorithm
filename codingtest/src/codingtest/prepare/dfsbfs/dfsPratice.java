package codingtest.prepare.dfsbfs;

import java.util.Stack;
import java.util.Arrays;

public class dfsPratice {


    static boolean[] chk;
    static int len = 0 ;
    static int sum = 0;
    public static void main(String[] args) {
        int answer = 0;
        int[] numbers = {1,1,1,1,1};
        //int[] numbers = {4,1,2,1};
        int target = 3;
        len= numbers.length;
        chk = new boolean[len];


        sum = Arrays.stream(numbers).sum();

        if(sum > target) {
            for(int i =0 ;i <len; i++) {
                for(int j =i ; j<len ; j++) {
                    if(!chk[i]) {

                        answer += getSum(numbers[i], numbers, target, i,j);
                        System.out.println("answer : " + answer);
                    }
                }
            }
        }
        else if(sum ==target) {
            System.out.println(1);
        }

        System.out.println(answer);
    }

    public static int getSum(int minusSum, int[] numbers, int target, int ti, int tj) {

         if(tj == len) {
            return 0 ;
        }

         int tmpSum = 0;

         tmpSum = sum -minusSum-numbers[tj];


        System.out.println("tmpSum = " + tmpSum + " minusSum = " + minusSum + " i : " + ti + " j :" + tj);
        //minusSum += numbers[tj];
        if(tmpSum == target) {
            chk[ti] = true;
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            return 1;
        }
        else if(tmpSum> target){
            return getSum( tmpSum,numbers,target,ti,tj+1);
        }
        else { //한번 더 빼기를 해야하는 상황

            return 0 ;
        }

    }
}
