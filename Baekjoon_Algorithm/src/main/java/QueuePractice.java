import java.util.Scanner;

public class QueuePractice {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // 7
		int unit = sc.nextInt(); // 3
		int count = 0, temp =0 , in=0,out=0 ,result=0;

		Queue queue = new Queue(input);

		
		 for(int i=0;i<input;i++) {
			 queue.enqueue(i+1); 
		 }
		  
		  while(queue.size > 0 ) {
			  
				  count ++ ; 
				  if(count % unit ==0) {
					  
					  
					  result++;
					  if(temp==queue.peek()) {
						  System.out.print(">");
						  break;
					  }
					  
	
					  if(count ==3) {
						  temp=queue.peek();
						  System.out.print("<");
					  }
	
					  System.out.print(queue.peek());
					  
					  if(result!=input) {
	
						  System.out.print(", ");
					  }
					  queue.pop(0);
				  }
				  out =queue.dequeue();
				  queue.enqueue(out);
			  }
		  }
		 
	}

	class Queue {
		int[] arr;
		int front =0, rear = -2, out = 0;
		int input = 0;
		int size =0 ;
		
		public Queue(int input) {
			// TODO Auto-generated constructor stub
			this.input =input;
			arr = new int[input];
		}

		public void pop(int i) {
			// TODO Auto-generated method stub
			
			arr[front] = i;
			
		}

		public int peek() {
			// TODO Auto-generated method stub
			return arr[front];
		}

		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return rear ==front;
		}

		public int dequeue() {
			// TODO Auto-generated method stub
			if(front == -1) 
				front =0 ;
			
			out = arr[front];
			front = (front+1)%input ;

			size--;	

			return out;

		}

		public void enqueue(int i) {
			// TODO Auto-generated method stub
			
			if(rear==-2)
				rear =0 ;
			else
				rear = (rear+1)%input ;

			arr[rear] = i;
			size++;

		}


}
