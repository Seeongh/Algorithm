package codingtest.prepare.Greedy;

import java.util.Scanner;

/**
 * Greedy : 매순간 가장 좋아보이는 것을 선택하는 방법
 * 돈 거슬러 주기
 * 500, 100, 50, 10
 * 거슬러야 할 돈이 N일때, 거슬러줘야할 동전의 최소 개수 구하기.
 */
public class GreedyRepeat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] money = {500, 100, 50, 10};

        int result = getChange(money, amount) ;
        System.out.println(result);
    }
    
    public static int getChange(int[] money, int amount ) {
        int change = 0 ;
       for ( int i = 0 ; i < money.length; i++) {
           change += amount/money[i];
           amount %= money[i];
       }
        // 똑 떨어지지 않은 경우에는 최소 값으로 냄.
        return change;
    }

}
