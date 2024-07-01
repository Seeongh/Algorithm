package codingtest.prepare.dfsbfs;

public class targetNumber {
    static int[] numbers = {1,1,1,1,1};
    static int target = 3;
    static int size = numbers.length;
    static int result = 0;
    public static void main(String[] args) {

        getResultdfs(0,0);
        System.out.println(result);
    }

    public static void getResultdfs(int index, int sum) {
        //종료조건
        if(index == size) {
            if(sum == target) {
                result++;
            }
           return ;
        }
        //구현내용
        //받은 인덱스 빼기
        getResultdfs(index+1, sum - numbers[index]);
        //받은 인덱스 더하기
        getResultdfs(index+1, sum + numbers[index]);

    }
}
