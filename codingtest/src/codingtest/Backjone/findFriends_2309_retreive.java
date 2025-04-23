package codingtest.Backjone;

import java.util.Arrays;
import java.util.Scanner;

public class findFriends_2309_retreive {
    static int total = 0;
    static   int[] arr = new int[9];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        total = 0 ;

        for(int i=0 ;i<arr.length; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
            sc.nextLine();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<= 7; i++) {
            retreiveTest(i , i+1);
        }
    }

    public static void retreiveTest(int i ,int j){
        if(j >= 9) {
            return;
        }


        if((total -(arr[i]+arr[j]))  == 100 ) {
            Arrays.stream(arr)
                    .filter(n -> n != arr[i] && n != arr[j])
                    .forEach(System.out::println);
        }

        retreiveTest(i, j+1);


    }
}
