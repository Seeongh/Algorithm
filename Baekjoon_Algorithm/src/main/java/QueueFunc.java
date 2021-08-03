import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueFunc {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int removecnt = sc.nextInt();
		int count = 0, temp =0  ;
		
		for(int i=0;i<input;i++) {
			q.add(i+1);
		}

		System.out.print("<");
		while(!q.isEmpty()) {
			count ++ ; 
			if(count % removecnt == 0) {
				System.out.print(q.remove());
				temp++;
				if(temp!=input) {
					System.out.print(", ");
				}
			}else {
				q.add(q.remove());
			}
			
		}
		System.out.print(">");
	}
}
