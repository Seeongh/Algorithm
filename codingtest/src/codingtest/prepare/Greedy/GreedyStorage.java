package codingtest.prepare.Greedy;
import java.lang.*;

public class GreedyStorage{

    public static void main(String[] args) {
        int[] arr= {2,4,5,4,6};
        int m = 8;
        int k = 3;
        int temp = 0;
        int result = 0;

        for(int j =0 ;j <arr.length; j++) {
            for(int i =j+1;i<arr.length-1; i++){

                if(arr[j] < arr[i+1]){
                    temp=arr[i+1];
                    arr[i+1] = arr[j];
                    arr[j]  = temp;
                }
            }
        }



        //     for(int rCnt = 0 ; rCnt < m; rCnt++ ) {
        //         if(rCnt ==0 || (rCnt % k) != 0){
        //              result += arr[0];
        //         }else {
        //              result += arr[1];
        //         }

        //     }
        // System.out.println(result);

        //큰수 * k + 두번째 큰수 + 큰수 * k + 두번째 큰수 ...
        // cnt = m/(k+1) : 반복 횟수
        // -> (큰수*k+두번쨰 큰수) * 횟수
        // if m/(k+1)이 안떨어지면 나머지 * 큰수를 추가해줌
        temp = m/(k+1);
        result = (((arr[0]*k)+arr[1])*temp) + ((m%(k+1))*arr[0]);
        System.out.println(result);

    }
}
