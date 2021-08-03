import java.util.Scanner;

public class DevideSort {
	static int white =0 ;
	static int blue =0 ;
	static int[][] arr; 
	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		arr=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		devide(0,0,n);
		
		System.out.print(white);
		System.out.print("\n");
		
		System.out.print(blue);
	}

	private static void devide(int a, int b,int n) {
		// TODO Auto-generated method stub

		if(allcolor(a,b,n)) {
			if(arr[a][b] == 1) blue ++;
			else if(arr[a][b] ==0 ) white++;
		}else {
			devide(a,b,n/2);
			devide(a,b+n/2,n/2);
			devide(a+n/2,b,n/2);
			devide(a+n/2,b+n/2,n/2);
		}
	}

	private static boolean allcolor(int a,int b,int n ) {
		// TODO Auto-generated method stub
		int temp = arr[a][b];

		for(int i=a;i<a +n;i++) {
			for(int j=b;j<b+n;j++) {
				if(temp!=arr[i][j])
					return false;
			}
		}
		
		return true;
	}
}
