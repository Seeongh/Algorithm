import java.util.Arrays;
import java.util.Scanner;

public class ThanosSearch {
	static int[] arr;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arrm= new int[m];
		
		for(int j=0;j<m;j++) {
			arrm[j] = sc.nextInt();
		}
		Arrays.sort(arr); //오름 차순 정렬
		
		for(int a=0;a<m;a++) {
			System.out.print(Thanos(arrm[a])+"\n");
		}
	}

	private static int Thanos(int compare) {
		// TODO Auto-generated method stub
		int leftindex = 0 ;
		int rightindex = arr.length -1 ;
			
			while(leftindex<=rightindex) {

				int midvalue = arr[(leftindex+rightindex)/2];
				
				if(compare < midvalue) {
					rightindex = midvalue-1;
				}else if(compare > midvalue){
					leftindex = midvalue+1;
				}else {
					return 1;
				}
			}
		
			
			return 0;
			
	}
}
