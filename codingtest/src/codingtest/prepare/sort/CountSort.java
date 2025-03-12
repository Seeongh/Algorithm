package codingtest.prepare.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 개수 정렬
 * 특정 조건이 부합할때 사용함
 * -> 모든 조건을 담을 수 있는 크기의 리스트(배열)을 선언해야함
 * 데이터를 하나씩 확인하며 데이터 값과 동일한 인덱스의 데이터를 1씩 증가
 * 횟수만큼 출력
 */
public class CountSort {

    static int[] arr = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};

    public static void main(String[] args) {

        int maxNum =  Arrays.stream(arr).max().getAsInt(); //최대값 구하기
        int[] indArr = new int[maxNum+1];

        Arrays.stream(arr).forEach(i -> indArr[i] = indArr[i]+1);

        IntStream.range(0, indArr.length).forEach(index -> {
            int value = indArr[index];



            // 인덱스와 값을 출력하거나 원하는 로직을 적용
            for(int i =0 ; i < indArr[index]; i++) {

              System.out.print(index);
            }
        });
    }

}
