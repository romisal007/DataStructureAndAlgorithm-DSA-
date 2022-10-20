import java.util.*;
class EvenorOdd{
	
	
	static String checkEvenOrOD(int n){
		
		return (n%2==0)?"EVEN":"ODD"; 
	}
	public static void main (String[] args){
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter value of n :" );
		int n=s.nextInt();
		
		System.out.println(checkEvenOrOD(n));
		
	}
	
}