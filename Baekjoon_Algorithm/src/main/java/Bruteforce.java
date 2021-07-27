import java.util.Scanner;

public class Bruteforce {

	 public static void main(String args[]) {
		 //weight,high
		 //input : number of people, weight high
		 //output: rank
		 int peopleNum = 0;
		 Scanner sc = new Scanner(System.in);
		 peopleNum = sc.nextInt();
		 

		 int[][] Arr = new int[peopleNum][2];
		 int[] rankArr = new int[peopleNum];
		 
		 for(int i =0;i<peopleNum;i++) {
			 Arr[i][0] = sc.nextInt();
			 Arr[i][1] = sc.nextInt();
			 rankArr[i] = 1;	//등수 배열 채우기
		 }
		 
		 for(int x=0;x<peopleNum;x++) {
			 for(int y =0 ;y<peopleNum;y++) {
				if( (Arr[x][0] - Arr[y][0] <0) && (Arr[x][1] - Arr[y][1] <0) ) { // y BIG
					rankArr[x] += 1;				
				}
			 }
		 }
		 
		 for(int k=0;k<peopleNum;k++) {
			 System.out.print(rankArr[k] + " ");
			 
		 }
	 }

	
}
