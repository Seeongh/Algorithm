package codingtest.prepare.sort;

/**
 * 선택정렬
 * - 가장 작은 데이터를 선택해 맨 앞에있는 데이터와 바꾸고,
 * 그 다음 작은 데이터를 선택해 앞에서 두번째 데이터와 바꾸는 과정 반복
 */
public class SelectionSort {

    static int maxlen = 10;
    static int[] arr = {7,5,9,0,3,1,6,2,4,8};
    public static void main(String[] args) {

        int tmp = 0;

        //가장 작은 데이터 선택하기
        for(int i =0 ; i < arr.length; i++) {
            int minIndex = getMindata(i, i+1); //작은 위치 찾기

            //교환
            tmp = arr[i] ;
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    //매개변수 : 인덱스, 제일 작은 수
    public static int getMindata(int index, int minIndex){

        if(index == maxlen ) {
            return minIndex;
        }

        if(arr[index] - arr[minIndex] > 0 ) {
            // 현재 index가 더 큼
            getMindata(index+1, minIndex);
        }
        else {
            getMindata(index+1, index);
        }

        return minIndex;
    }
}




/**
 * java comparable, comparator
 * comparable : .lang패키지 compareTo(o) 구현 -> 자기자신과 매개변수 객체 비교
 * comparator : .util 패키지 compare(o1,o2) 구현 -> 두 매개변수 객체 비교
 */
