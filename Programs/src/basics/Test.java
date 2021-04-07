package basics;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num:");
		int num = sc.nextInt();
		
		String DIGITS[]  = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
		String ELEVENS[]  = {"TEN","ELEVEN","TWEVELE","THRITEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINE TEEN"};
		String TENS [] = {"","","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY"};
		String HUNDREDS [] = {"HUNDRED"};
		
		if(num<=9) { //[0-9]
			System.out.println(DIGITS[num]);
		}else if(num>=10 && num<=19) {//10 to  19  , 
			System.out.println(ELEVENS[num-10]);
		}else if(num>=20 && num<=99){// 20 TO 99
			//21 
			int div = num/10;
			int rem = num%10;
			System.out.println(TENS[div] + " "+ (rem==0?"":DIGITS[rem]));
		}else if(num>=100 && num<=999){// 100 TO 999
			
			int div = num/100;//first digit
			int div1 = num/10;
			int t = div1%10;//second digit
			int rem = num%10;//last digit
			
			System.out.println(DIGITS[div]+" "+ HUNDREDS[0] +" "+TENS[t]+" "+(rem==0?"":DIGITS[rem]));
		}
	}

}
