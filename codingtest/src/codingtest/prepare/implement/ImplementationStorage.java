package codingtest.prepare.implement;

import java.util.Arrays;

public class ImplementationStorage {
    public static void main(String[] args) {

        //딱 떨어지는 배열 개선
        int[] arr = new int[]{1,36,2,3,4};
        int divisor = 5;

        int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};

        //받은 배열에서 n까지의 배열만 반환
       // int[] num_list = new int[0]; //받은 배열
        //int[] answer = {};
        //int n=0;

        //answer = Arrays.copyOfRange(num_list,0,n);




    }

    /*
    상하좌우
     */
    public void updawnleftright() {
        //상하좌우 n*n정사각형에서 lurd 지도를 보고 어디에 위치할지
        int n = 5;
        String[] strRLUD = {"R", "R", "R", "U", "D", "D"};
        int result_ud = 1;
        int result_lr = 1;

        int[] arry= {0,0,-1,1};
        int[] arrx = {-1,1,0,0};
        String[] move_types = {"L","R","U","D"};
        for(String m : strRLUD) {
            for(int i =0 ; i<move_types.length; i++){
                if(m.equals(move_types[i])) {
                    result_lr = (result_lr + arrx[i]) > 0? (result_lr + arrx[i]): result_lr;
                    result_ud = (result_ud + arry[i]) > 0? (result_ud + arry[i]): result_ud;
                }
            }
        }



//
//        for(String p: strRLUD) {
//
//            if(p.equals("R")) {
//                if(result_lr < n) {
//                    result_lr+=1;
//                }
//            }
//            else if(p.equals("L")) {
//                if(result_lr > 1) {
//                    result_lr -= 1;
//                }
//            }
//            else if(p.equals("U")) {
//                if(result_ud > 1) {
//                    result_ud -= 1;
//                }
//            }
//            else if(p.equals("D")) {
//                if(result_ud < n) {
//                    result_ud += 1;
//                }
//            }
//        }
//
        System.out.println( result_ud+ " " + result_lr );
    }

    public void oneChar(){
        //한번만 등장한 문자 (문자열에서 딱 한번만 등장한 알파벳의 사전순정렬 반환)
        String s = "" ;
        int[] answer = new int[s.length()];
        String result ="";
        for(int i =0; i< s.length(); i++) {
            answer[s.indexOf(s.charAt(i))] +=1 ;
        }

        for(int i = 0;i<s.length();i++){
            if(answer[i] == 1) {
                result+=s.charAt(i);
            }

        }


        char[] chArr = result.toCharArray();
        Arrays.sort(chArr);

        System.out.println( new String(chArr));

    }

    //딱 떨어지는 값만 배열로 반환하기
    public void arr_resolve(){
        int[] arr = new int[]{1,36,2,3,4};
        int divisor = 5;

        int count = 0;
        for(int i =0 ; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                count++;
            }
        }

        int[] answer = new int[count];
        count = 0;

        for(int i =0 ; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                answer[count++] = arr[i];
            }
        }

        if(count == 0) { answer = new int[1]; answer[0] = -1;}

        Arrays.sort(answer);

    }
}

