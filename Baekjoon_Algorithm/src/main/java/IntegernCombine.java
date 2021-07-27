import java.util.Scanner;

public class IntegernCombine {
	 public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
		 int[][] arr = new int[1000][2];
		 int a=0,b =0, j=0;
		 
		for(int i=0; i>= 0; i++) {
			arr[i][j]= sc.nextInt();
			arr[i][j+1]  = sc.nextInt();
			if(arr[i][j] == 0 &&  arr[i][j+1] == 0 ) break; 
	
		}
		 
		for(int k=0;k>=0;k++) {
			a = arr[k][j];
			b = arr[k][j+1];
			if(a != 0 && b != 0) {
				if( 0 == a%b) { //a가 배수고 b가 약수 
					System.out.print("multiple");			 
				}
				else if( 0 ==b%a) {
					System.out.print("factor");			 
				}
				
				else {
					System.out.print("neither");
				}
			}else {
				if(a == 0 && b == 0) {
					break;
				}else {
					System.out.print("neither");
					
				}
			}
				System.out.print("\n");
				
		}
			
			
	 }
}
