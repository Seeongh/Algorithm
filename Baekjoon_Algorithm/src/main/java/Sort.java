import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Sort {
	
	 public static void main(String args[]) {
		
		 //WordSort();
		 //input = number ex)2431
		 //output = sorted 3x)4321
		 Scanner sc = new Scanner(System.in);
		 int input = sc.nextInt();
		 int n = 0, index =0 ;
		 int length = (int)(Math.log10(input)+1);	//몇자리수인지 확인
		 int[] arr = new int[length];
		 
		 //input to arr
		 while(input >= 0) {
			 n = input%10;
			 input /= 10;		
			 arr[index] = n;

			 index++;
			 if(index==length)
				 break;
		 }
		 index = 0;
		 
		 while(index<length) {
			 for(int i =1 ;i<length;i++) {
				 if(arr[i] > arr[i-1]) {
					 int temp ;
					 temp = arr[i];
					 arr[i] = arr[i-1];
					 arr[i-1] = temp;
				 }
			 }
			 index++;
		 }
		 
		 for(int j = 0;j <length ; j++) {
			 System.out.print(arr[j]);
		 }
		 
	 }
/*
	// input: 단어개수n, n개만큼의 단어 
	// output : n개의 들어온 단어중 길이가 짧은것 순으로 정렬
	//			같을경우 알파벳 오름차순 정렬

	private static void //WordSort() {
		// TODO Auto-generated method stub
		 int count = 0;
		 //사용자 개수 입력
		 System.out.println("input number:");
		 Scanner sc =new Scanner(System.in);
		 count=sc.nextInt() ;
		 
		 String StrArr[] = new String[count];	// 사용자 입력한 n개만큼 단어를 받아드림
		 sc.nextLine(); //개행 버림
		
		 for(int i=0;i<count;i++) {
			 StrArr[i] = sc.nextLine(); //입력받은 String
			 
		 }// 입력한 문자 배열에 담기
		 
	
		Arrays.sort(StrArr,new Comparator<String>() {
	
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()==o2.length()) {
				 return o1.compareTo(o2);
				}
				else {
					return o1.length() - o2.length();
				}
			}
			
			
		});
		
			
		 for(int i=0;i<count;i++){
			 System.out.print(StrArr[i]);
			 System.out.print("\n");
		 }
		
	}

 */

}
