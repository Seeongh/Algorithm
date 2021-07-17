import java.util.Scanner;

public class Recursion1 {

	 public static void main(String args[]) {
		 //BasicAlgorithmPratice();
		 System.out.println("input number:");
		 Scanner sc =new Scanner(System.in);
		 int count = 0 ;
		 System.out.println("\n");
		 //System.out.println(RecursionFactorial(sc.nextInt()));
		 
		// System.out.println(RecursionFibonacci(sc.nextInt(),0,0,1));
		// System.out.println(RecursionFibonacci_beakjoon(sc.nextInt());
	 }
 /*
 private static int RecursionFibonacci_beakjoon(int a) {
 
		// TODO Auto-generated method stub
		if(a==0)return 0;
		if(a==1)return 1;
		
		return RecursionFibonacci_beakjoon(a- 1) + RecursionFibonacci_beakjoon(a - 2);
	}
*/
 /*
 private static int RecursionFibonacci(int a,int count,int fst,int dst) {
 
	// TODO Auto-generated method stub
	count ++;
	if(a <2) {
		return a;
	}else {
		if(a==count) {			
			return dst;
		}else {
			return RecursionFibonacci(a,count,dst,fst+dst);
		}
	
	}
}
*/

	/*	private static int RecursionFactorial(int a) {
		// TODO Auto-generated method stub
		if(a==0) {
			return 1;
		}else {
		return a*RecursionFactorial(a-1);	
		}
	}
*/
	private static void BasicAlgorithmPratice() {
		// TODO Auto-generated method stub
		/*for
		int a = 0;
		Scanner sc=new Scanner(System.in);

		System.out.print("값입력\n");
		a=sc.nextInt();
		for(int i=a;i>0;i--) {
			System.out.print(i);
			System.out.print("\n");
		}
		
		*/
		/*if - set alram 45min early
		int hour = 0;
		int min = 0;

		Scanner sc =new Scanner(System.in);
		System.out.print("Hour");
		hour = sc.nextInt();
		System.out.print("\n");
		System.out.print("minute");
		min = sc.nextInt();

		System.out.print("\n");
		if(min >= 45) {
			System.out.print("Set Alram :"+ hour +" : "+ (min-45));
		}
		else {
			if(hour==0)
				hour=24;
				
			System.out.print("Set Alram :"+ (hour-1) +" : "+ (60-(45-min)));

		}
		*/
		/* input output
		int a = 0 ;
		int b = 0 ;
		int temp = 0;
		 
		 Scanner sc =new Scanner(System.in);
		 for(int i=1;i<3;i++) {
			 do{
				 System.out.print("입력"+ i+":\n");
				 temp = sc.nextInt();
			 }while(temp<0 || 10<temp);
			 if(i == 1){
				 a =temp;
			 }				
			 else if(i==2) {
				 b =temp;
			 }
		 }
		 System.out.print("sum :"+ (a+b)+"\n");
		 System.out.print("multiple :"+ (a*b)+"\n");
		 System.out.print("devide :"+ (a/b)+"\n");
		*/
		 
		 /* cat
			   System.out.println("\\    /\\\n"
			   		+ " )  ( ')\n"
			   		+ "(  /  )\n"
			   		+ "\\(__) |");
		   */
		
	}
	
}
