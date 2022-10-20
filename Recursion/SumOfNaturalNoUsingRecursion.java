import java.util.*;
class SumOfNaturalNoUsingRecursion{


	public static void main (String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the natural no upto which you want to print sum ");
		int n=s.nextInt();
		int sn=sum(n);
		System.out.println("Sum of Natural no up "+ n+" is:"+sn);
	}	
		static int sum(int n){
			
			if(n==0){
				return 0;
			}
			else{
				
				return n+sum(n-1);
			}
		}
}