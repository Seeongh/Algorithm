import java.util.Scanner;

public class BackTracking {
	public static int[] arr;
	public static boolean[] visit;
	 public static void main(String args[]) {
		 
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int index = 0 ;
		 arr = new int[m]; //출력을 위한 배열
		 visit = new boolean[n];
		 
			/*
			 * for( int i = 0; i<m;i++) { index *= n ; //몇번 수행하는지 결정 }
			 */
		BackTracking(n,m,index);
		 
	 }

	private static void BackTracking(int n, int m,int index) {
		// TODO Auto-generated method stub
		if(m == index) {
			for(int i =0 ; i<arr.length;i++) {
				System.out.print(arr[i] +" ");
			}
			System.out.print("\n");

		}else {
			for(int i=0;i<n;i++) {
				if(visit[i] == false) {
					visit[i] = true;
					arr[index] = i+1;
					BackTracking(n,m,index+1);
					
					visit[i] = false;
				}
				
			}
		}
	}
	 
}

