import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.*;


public class jPract {
		/********* finding maximum difference between consecutive numbers 
		 * @return **************/
	public static void main(String[] args){
	int[] numbers = {5,10,24,30,50,72};
	int maxDiff =numbers[0];
		for(int c=1;c<numbers.length;c++){
			
			if (numbers[c] > maxDiff){
				maxDiff = numbers[c] - numbers[c - 1];
				System.out.println("difference is: " + maxDiff);
			}
		}
		System.out.println("highest difference is: " + maxDiff);
		replaceChar("joooooo", 'o');
		fibSeries(1000);
		fact(10);
		primeNo(182);
		sumOfDigits(100001);
		/********* finding maximum difference between consecutive numbers **************/
}
	@Test(dataProvider = "datasetDataProvider")
	public static String replaceChar(String str, char ch){
		String str2 = null;
		for(int i =0; i< str.length(); i++)
		{
			if(str.charAt(i) == 'a')
			{
				str2 = str.replace('a', ch);
			}
		}
		if(str2 == null) System.out.println("Character not found...!");
		else System.out.println("replaced string is: " +str2);
		return str2;
	}
	
	
	public static int[] fibSeries(int max){
		int[] fibSer = new int[1000]; 
		int i=2;
		fibSer[0] = 0; fibSer[1] = 1;
		for(i=2; fibSer[i-1] <  max; i++){
			fibSer[i] = fibSer[i-1] + fibSer[i-2]; 
			//System.out.println("f0 and f1: " + fibSer[i-1] + "\n" + fibSer[i-0]);
			System.out.println("fibonacci series: " + fibSer[i-1]);
			//i+=1;
			//System.out.println("i value: " + i);
		}
		return fibSer;
	}
	public static int fact(int f){
		int fact=1;
		for(int i=f;i>=1;i--){
			fact = fact * i;
			System.out.println("fact: " + fact);
			System.out.println("i: " + i);
		}
		System.out.println("factorial of " + f + ": " + fact);
		return fact;
	}
	@SuppressWarnings("unused")
	public static boolean primeNo(int p){
		boolean priFlag = true;
		for(int i=2; i<p; i++){
			int res = p%i;
			System.out.println("res" + res);
			if(res == 0){
				priFlag = false;
				System.out.println("res" + res);
			break;
			}
		}
		if(priFlag)
			System.out.println(p + " is prime number");
		else System.out.println(p + " is not prime number: ");
		return priFlag;
	}
	public static int sumOfDigits(int no){
		int s = 0; 
		while(no%10 >0 || (no%10 == 0 && no>0)){
			int res = no%10;
			no = no/10;
			//System.out.println("number is: " + no);
			//System.out.println("bal: " + res);
			s += res;
		}
		if(s > 0)
			System.out.println("sum of digits is: " + s);
		return s;
	}
}
