import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Sort {
	
	// input: 단어개수n, n개만큼의 단어 
	// output : n개의 들어온 단어중 길이가 짧은것 순으로 정렬
	//			같을경우 알파벳 오름차순 정렬

	 public static void main(String args[]) {
		

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



}
