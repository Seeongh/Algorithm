import java.util.Scanner;

public class DynamicProgramming {

	public static int[] dp;
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int input = sc.nextInt();
		 System.out.print("\n");
		 int[] in = new int[500]; //값을 받는 배열
		 int[] dp = new int[500]; //저장하는 배열

		 int finalvar = 0 ;
		 int parentvar = 0;
		 int inputvar = 0;

		 for(int i=0;i<input;i++) {

			 
			 for(int j=0;j<i+1;j++) {
				int temp = 0;
				in[j]= sc.nextInt();
		
				
				
			 }
	/*
			 dp[finalvar] = dp[parentvar] + in[inputvar];
		
			 
			 dp[0] = dp[0] + in[0]; //7 + 0
			 
			 dp[0] = dp[0] + in[0] ; //7 + 3
			 dp[1] = dp[0] + in[1] ; //7 + 8
			
			 dp[0] = dp[0] + in[0] ; //10 + 8
			 dp[1] = dp[0] + in[1] ; //10 + 1
			 dp[2] = dp[1] + in[1] ; //15 + 1
			 dp[3] = dp[1] + in[2] ; //15 + 0
			 
			 dp[0] = dp[0] + in[0] ; //18 + 2
			 dp[1] = dp[0] + in[1] ; //18 + 7
			 dp[2] = dp[1] + in[1] ; //11 + 7
			 dp[3] = dp[1] + in[2] ; //11 + 4
	*/
			
			 
			 
			 System.out.print("\n");
		 }

	 }
}
