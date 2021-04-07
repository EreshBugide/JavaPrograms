package basics;

public class Swapping2Numbers {
	public static void main(String[] args) {
		
		int a=10, b=20;
		System.out.println("before swapping number ..."+a +"  "+ +b +"...");
		//logic-1 ==> using Third variable 
		
		/*int c=a; //c=10
		a=b; //a=20
		b=c; //b=10*/
		//logic-2 ==> using + and - operator, without using Third variable
		
		/*a = a+b; //a=10+20=30 
		b = a-b; //b=30-20=10 
		a = a-b; //a=30-10=20*/
		
		//logic-3 ==> using * and / operator, without using Third variable
		
		/*a = a*b; //a=10*20=200
		b = a/b; //b=200/20=10
		a = a/b; //a=200/10=20*/
		
		//logic-3 ==> using Bitwise XOR(^) operator
		
		a=a^b; //a=10^20=30
		b=a^b; //b=30^20=10
		a=a^b; //a=30^10=20
		
		 		
		System.out.println("After swapping number ..."+a +"  "+ +b +"...");
	}
}
