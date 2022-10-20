import java.util.*;
class calculatePower{
	
	public static void main (String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no for power to claculate ");
		int a=s.nextInt();
		int b=s.nextInt();
		//System.out.println("Sum of Natural no up "+ n+" is:"+sn);
		long p=power(a,b);
		System.out.println(p);
	}
	
	static int power(int a,int b){
		
		if(b>=1){
			
			return a*power(a,b-1);
		}
		else{
			return 1;
		}
		
	}
}