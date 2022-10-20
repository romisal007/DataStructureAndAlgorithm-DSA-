import java.util.*;
public class PrintNaturalNo{
	
	public static void main (String[] args){
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the natural no upto which you want to print");
		int n=s.nextInt();
		printNo(n);
	}
	
	 static void printNo(int n){
		 System.out.println();
		if(n>1){
						System.out.println(n);
			printNo(n-1);
						System.out.println(n);

		}
		
	}
	
}
