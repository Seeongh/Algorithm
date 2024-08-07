package codingtest.prepare.sort;


import java.util.Arrays;

/**
 * 퀵 정렬
 * 기준(피벗)을 설정한 후, 큰수와 작은 수를 교환한 후 리스트를 반으로 나누는 방식
 * 호어 분할 : 리스트의  첫번째 데이터를 피벗으로 정한다.
 * 피벗을 기준으로 왼쪽에서 피벗보다 큰 수를 찾고,
 * 오른쪽에서 피벗보다 작은 수를 선택해서 자리를 바꿔줌.
 *
 * 찾다가 값이 엇갈려(오른쪽은 왼쪽진영으로, 왼쪽은 오른쪽 진영으로)
 * 이 경우 작은 데이터와 피벗의 위치를 변경함.
 * 이렇게 되면 왼쪽엔 피벗보다 작은수 오른쪾엔 피벗보다 큰 수가 위치함.
 */
public class QuickSort {

    static int[] arr = {7,5,9,0,3,1,6,2,4,8};

    static int maxlen = arr.length;

    public static void main(String[] args) {
        int pivot = 0 ;
        int leftInd =  0 ;
        int rightInd = maxlen-1;

         pivot_sort(leftInd,rightInd) ;

        Arrays.stream(arr).forEach(System.out::print);

    }

    public static void pivot_sort( int leftInd, int rightInd) {

        int tmp = 0 ;

        if(leftInd >= rightInd) return  ;


        int pivot = partition(leftInd, rightInd);

        pivot_sort(leftInd, pivot-1); //왼쪽
        pivot_sort( pivot+1, rightInd);

    }

    public static int partition( int leftInd, int rightInd) {
        int tmp = 0;
        int lo = leftInd;
        int hi = rightInd;
        int pivot = leftInd;


        System.out.println("partition+++++++++++++++++++++ : " );
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println("");

        System.out.println("leftInd : " + leftInd);
        System.out.println("rightInd : " + rightInd);

        System.out.println("pivot : " + pivot);
        while(lo < hi ) {

            //rigntInd 구하기
            while(arr[hi] >= arr[pivot] && lo < hi ) {
                hi--; //8

            }
            //leftInd 구하기
            while(arr[lo] <= arr[pivot] && lo < hi ) {
                lo++; //2

            }



            System.out.println("lo : " + lo);
            System.out.println("hi : " + hi);
            if(lo < hi) {

                tmp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = tmp;


                Arrays.stream(arr).forEach(System.out::print);

            }


        }


        tmp = arr[pivot];
        arr[pivot] = arr[lo];
        arr[lo] = tmp;

        return lo;

    }
}
