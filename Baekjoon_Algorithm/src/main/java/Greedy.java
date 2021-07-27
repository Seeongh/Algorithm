import java.util.Scanner;

public class Greedy {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int allnum = sc.nextInt();
		 int[] arr = new int[allnum];
		 int result =0, finalnum =0 ;
		 
		 for(int i=0;i<allnum;i++) {
			 arr[i] = sc.nextInt(); //인출 시간
		 }
		 
		 for(int b=0;b<allnum;b++) {
			 for(int a=0;a<allnum-1;a++) {
				 int temp  = 0 ; 
				 if( arr[a+1]<arr[a]) { // 3,2
					temp = arr[a+1];
					arr[a+1] = arr[a];
					arr[a] = temp; //2,3
				 }
				 
			 }
		 }

		 for(int n=0;n<allnum;n++) {
			 result += arr[n];
			 finalnum += result ; 
		 }
		System.out.print(finalnum);
	 }
}
