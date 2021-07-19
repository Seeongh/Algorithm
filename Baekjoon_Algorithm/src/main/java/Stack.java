
public class Stack{

	int top;
	int[] stack;
	int size;

	public Stack(int size) {
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public int peek() {
		return stack[top];        
	}

	public void push(int value) {
		stack[++top] = value;
		System.out.println(stack[top] + " PUSH !");
	}

	public int pop() {
		return stack[top--];
	}
	
	public boolean isEmpty() { 
		return (top == -1); // ���� -1�̸� �׸��� �ϳ��� ���� ����
	}
}
