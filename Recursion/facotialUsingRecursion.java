import java.util.* ;

class facotialUsingRecursion{
	
	public static void main (String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no to calculate factorial ");
		int a=s.nextInt();
		//System.out.println("Sum of Natural no up "+ n+" is:"+sn);
		int f= fact(a);
		System.out.println(f);
	}
	
	static int fact(int n){
		
		if(n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}

}