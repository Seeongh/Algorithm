package codingtest.Backjone;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백설공주의 난장이 찾기
 */
public class findFreinds_2309 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int sum = 0 ;

        for(int i=0 ;i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            sc.nextLine();
        }

        Arrays.sort(arr);

        for(int i=0; i<= 7; i++) {
            for(int j = i+1; j <= 8; j++) {
                if(sum - (arr[i]+ arr[j]) == 100) {
                    System.out.println(arr[i]+"." + arr[j]);
                    int va1 = arr[i];
                    int va2 = arr[j];
                    Arrays.stream(arr)
                            .filter(n -> n != va1 && n != va2)
                            .forEach(System.out::println);

                }
            }
        }

    }
}
