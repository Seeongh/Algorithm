package codingtest.prepare.implement;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 구현 : 소스 코드 만들기 (피지컬!)
 * 상하 좌우
 * 판의 크기 n과 가야하는 방향을 나타내는 배열을 받아 어디에 도착하는지 구현.
 */
public class ImplementationRepeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String LRUD =  sc.nextLine();
        String[] strArray = LRUD.split(" ");

        int[] dx  = {-1, 1, 0 , 0 };
        int[] dy = {0, 0, -1, 1};
        String[] position = {"U","D","L","R"};
        int x= 1 , y =1 ;

        for(int i = 0; i<strArray.length; i++) {
            for(int j =0 ;j <position.length; j++) {
                if(position[j].equals(strArray[i]))  {

                    if(x + dx[j] == 0 || x +dx[j] > n || y+dy[j] == 0 || y + dy[j] >n) {
                        continue;
                    }
                    x += dx[j];
                    y += dy[j];
                }
            }

        }

        System.out.println("결과 = "+ x +"," + y);
    }
}
