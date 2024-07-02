package codingtest.prepare.sort;

/**
 * 삽입 정렬
 * 구현난이도는 선택정렬보단 높지만 시간적으로 효율적
 * 데이터가 거의 정렬되어있을때 효과적
 * 앞부분의 데이터는 정렬되어있다고 가정하고 그 앞/뒤로 삽입
 */
public class InsertSort {
    static int[] arr = {7,5,9,0,3,1,6,2,4,8};

    static int maxlen = arr.length;

    public static void main(String[] args) {
        int[] result = new int[maxlen];
        int tmp = 0;

        for(int i = 0 ; i < maxlen; i++) {
            //i의 이전 배열 중 어디에 들어가야 할지 정해야 됨
            //앞은 늘 정렬되어있음을 가정
            for(int j = i ; j > 0  ;j--) {
                if(arr[i] >= arr[j]) { //
                    //정렬된 곳 중 i보다 작은곳을 찾음
                    tmp = arr[i]; //들어갈 변수 임시저장

                }
            }
        }
    }
}
