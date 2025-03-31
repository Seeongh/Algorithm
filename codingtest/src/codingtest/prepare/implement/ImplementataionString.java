package codingtest.prepare.implement;

import java.util.Arrays;

public class ImplementataionString {
    public static void main(String[] args) {
        String dopa = "umzunsik";
        //앞에서부터 3개 문자열 출력
        System.out.println(dopa.substring(0,3));
        //문자열 거꾸로 출력
        System.out.println(new StringBuilder(dopa).reverse().toString());
        //거꾸로 출력한 문자열에 umzunsik문자열 추가
        System.out.println(new StringBuilder(dopa).reverse().toString()+dopa);
    }
}
