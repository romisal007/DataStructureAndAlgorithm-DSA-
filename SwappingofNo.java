import java.util.*;
class SwappingOfNo{

	public static void  main(String [] args){
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s.nextInt();
		System.out.println("Enter value of b");
		int b= s.nextInt();
		int temp=0;
		
		System.out.println("Enter Logic with wich you want to execute of ");
		int logic =s.nextInt();
		switch(logic){
			
			case 1:
		//Logic 1 with Temp variable
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping using temp variable  value of a :"+a +" b:" + b);
		break;
		case 2:
		//Without temp variable using add and sub;
			a=a+b;
			b=a-b;
			a=a-b;

				System.out.println("After Swapping usinf add and sub  value of a :"+a +" b:" + b);
		break;

		case 3 :
		
			a=a*b;
			b=a/b;
			a=a/b;
			System.out.println("After Swapping usinf mul and div  value of a :"+a +" b:" + b);
			break;
		
		case 4:
			a=a^b;
			b=a^b;
			a=a^b;
			
		 System.out.println("After Swapping usinf bitwise value of a :"+a +" b:" + b);
		break;
		
		case 5 :
			a=(a+b)-(b=a);
				System.out.println("After Swapping in single line value of a :"+a +" b:" + b);
		break;
		}
	}

}