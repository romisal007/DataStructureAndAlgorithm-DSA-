import java.util.*;

class SumOfNaturalNo{
	//Using for loop
	static double SumOFNaturalNO_V1(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		return sum;
	}
	
	//using formulae 
	static double SumOFNaturalNO_V2(int n){
		
		return ((n*(n+1))/2);
		
	}
	//Using Recursion
	static double SumOFNaturalNO_V3(int n){
		if(n==0){
			return 0;
		}
		else{
			return n+SumOFNaturalNO_V3((n-1));
		}
	}
	public static void main (String[] args){
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter value of n :" );
		int n=s.nextInt();
		System.out.println("Method for loop Sum of Natural no up to :" + n+ " is: "+SumOFNaturalNO_V1(n));
		System.out.println("Method using formulae Sum of Natural no up to :" + n+ " is: "+SumOFNaturalNO_V2(n));
		System.out.println("Method using Recursion Sum of Natural no up to :" + n+ " is: "+SumOFNaturalNO_V3(n));

		
	}
}