package basics;

import java.util.Scanner;

public class convert 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		String DIGITS[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWEVELE","THRITEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
//		String ELEVEN[] = {"TEN","ELEVEN","TWEVELE","THRITEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
		String TENS[] = {"","","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY"};
		
		if(num<=19)
			System.out.println(DIGITS[num]);
//		else if (num<=19)
//			System.out.println(ELEVEN[num-10]);
		else if(num<=99)
		{
			int div = num/10;//first digit
			int rem = num%10;//last digit
			System.out.println(TENS[div]+" "+(rem==0?"":DIGITS[rem]));
		}
		else if(num<=999)
		{
			int div = num/100; //first digit
			int tt = num/10;
			int tens = num%10;//second digit
			int rem = num%10; //last digit
			System.out.println(DIGITS[div]+" HUNDRED "+ TENS[tens]+" "+(rem==0?"" :DIGITS[rem]));
		}
	}
}
