package codingtest.prepare.sort;

import java.sql.SQLOutput;
import java.util.Arrays;

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
        int target = 0;

        for(int i = 1 ; i < maxlen; i++) {
            //i의 이전 배열 중 어디에 들어가야 할지 정해야 됨
            //앞은 늘 정렬되어있음을 가정

            //1. 정렬 끝자리인 i의 바로 뒤를 삽입할 대상으로 선정
            //2. i부터 0 까지 하나씩 j로 돌면서 대상보다 작은 수를 찾음
            //3. 삽입 대상보다 작은 수 발견시
            //4. 임시변수에 대상을 넣고,
            //5. i부터 한칸뒤씩 이동한다.
            //6. 완료되면  작은수 뒷수에 임시변수 값을 넣는다.

            //{7,5,9,0,3,1,6,2,4,8};
            //i = 선택한 수 , j = 정렬된 수 반복
            target = arr[i];
            for(int j = i;  j > 0  ; j--) {
                if (arr[j - 1] < target) { // 왼쪽 숫자가 타켓보다 작으면
                    if (j == i) { // 근데 맨 처음시작일때는 그냥 다음 숫자로 넘어감
                        break;
                    }

                    arr[j+1]= arr[j]; //현재 값 오른쪽으로 미뤄놓고
                    arr[j] = target; //현재값에 타겟 넣어놓고
                    break;
                }

                //왼쪽 숫자가 타겟보다 크면
                arr[j] = arr[j-1]; //한칸씩 뒤로!
            }
        }

        Arrays.stream(arr).forEach(x -> System.out.println(x));

    }

}
