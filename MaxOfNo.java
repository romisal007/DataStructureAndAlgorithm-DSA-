import java.util.*;

class MaxOfNo{
	
	//ternary Operator
	static int Max_v1(int a,int b){
		
		return (a>b)?a:b ;
	}
	//Using math.max
	static int Max_v2(int a, int b){
		
		return Math.max(a,b);
	}
	public static void main (String[] args){
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter value of a :" );
		int a=s.nextInt();
		System.out.println("Enter value of b :" );
		
		int b=s.nextInt();
		
		System.out.println("maximum of no using vsesion 1 a ="+ a+ " b ="+b + " is :" +MaxOfNo.Max_v1(a,b));

		System.out.println("maximum of no using vsesion 2 a = "+ a+ " b ="+b + " is :" +MaxOfNo.Max_v2(a,b));
		
	}
}