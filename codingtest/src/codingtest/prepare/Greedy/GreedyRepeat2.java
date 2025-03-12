package codingtest.prepare.Greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 배열의 수를 M번더하여 큰 수를 만듦
 * 특정 인덱스 수가 연속해서 k번을 초과하여 더해질 수 없음.
 * 서로 다른 인덱스의 수가 같아도 다른것으로 간주
 */
public class GreedyRepeat2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt(); //array size
        int max = sc.nextInt() ; // 더할 수 있는 회수
        int k = sc.nextInt(); // 하나의 인덱스가 연속해서 더할 수 있는수
        sc.nextLine();
        int[] array = new int[size];
        int result = 0;

        for(int i =0 ;i < size ; i++){
            array[i] = sc.nextInt();
        }


        Arrays.sort(array); // 정렬

        for(int i =0 ; i<max ; i++) {
            if(i % k != 0 || i == 0){
                result += array[size-1];
            }
            else {
                result += array[size-2];
            }
        }

        System.out.println(result);
    }
}
