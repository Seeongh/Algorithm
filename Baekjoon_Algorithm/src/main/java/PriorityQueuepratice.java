import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuepratice {
	
		public static class Student{
			int num;
			public Student(int num) {
				this.num = num;
			}
			
			public String toString() {
				return num + "";
			}
		}
		
		public static class MyComperator implements Comparator<Student>{
			int o1abs, o2abs;
			@Override
			public int compare(PriorityQueuepratice.Student o1, PriorityQueuepratice.Student o2) {
				// TODO Auto-generated method stub
				o1abs = Math.abs(o1.num);
				o2abs = Math.abs(o2.num);
				if(o1abs == o2abs) { //음수 내보내기
					return o1.num-o2.num;
				}else {

					return o1abs-o2abs;
				}
			}
			
		}

	    public static void main(String[] args) throws IOException {
	    	PriorityQueue<Student> pq = new PriorityQueue<Student>(new MyComperator());
	    	Scanner sc = new Scanner(System.in);
	    	int input = sc.nextInt();
	    	int num = 0 ;
	    	int[] arr = new int[input];
	    	
	    	for(int i =0 ;i< input ; i++) {
	    		num = sc.nextInt();
	    		if(num ==0) {
	    			if(pq.isEmpty()) {

		    			System.out.print(0);
		    			System.out.print("\n");
	    			}
	    			else {

		    			System.out.print(pq.poll()+"\n");
	    			}
	    		}
	    		else {
	    			pq.offer(new Student(num));
	    		}
	    		
	    	}
	    
	       
	    }
	   
		
}

