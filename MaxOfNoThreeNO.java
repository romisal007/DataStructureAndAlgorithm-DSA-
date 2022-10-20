import java.util.*;

class MaxOfNoThreeNO{
	
	//ternary Operator
	static int Max_v1(int a,int b, int c){
		
		return ((a>b)&&(a>c))?a:((b>c)?b:c) ;
	}
	//Using math.max
	static int Max_v2(int a, int b , int c){
		
		return  Math.max(Math.max(a,b),c) ;
	}
	public static void main (String[] args){
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter value of a :" );
		int a=s.nextInt();
		System.out.println("Enter value of b :" );
		int b=s.nextInt();
		System.out.println("Enter value of b :" );
		int c=s.nextInt();
		
		System.out.println("maximum of no ternary operator  a ="+ a+ " b ="+b + " c="+c+" is :" +Max_v1(a,b,c));

		System.out.println("maximum of no using Math.max function 2 a = "+ a+ " b ="+b + " c="+c+" is :" +Max_v2(a,b,c));
		
	}
}