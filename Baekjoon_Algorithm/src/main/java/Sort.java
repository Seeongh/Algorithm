import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class Sort {
	
	// input: �ܾ��n, n����ŭ�� �ܾ� 
	// output : n���� ���� �ܾ��� ���̰� ª���� ������ ����
	//			������� ���ĺ� �������� ����

	 public static void main(String args[]) {
		

		 int count = 0;
		 //����� ���� �Է�
		 System.out.println("input number:");
		 Scanner sc =new Scanner(System.in);
		 count=sc.nextInt() ;
		 
		 String StrArr[] = new String[count];	// ����� �Է��� n����ŭ �ܾ �޾Ƶ帲
		 sc.nextLine(); //���� ����
		
		 for(int i=0;i<count;i++) {
			 StrArr[i] = sc.nextLine(); //�Է¹��� String
			 
		 }// �Է��� ���� �迭�� ���
		 
	
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
