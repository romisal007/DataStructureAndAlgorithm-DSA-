
import java.util.*;
class TrailZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Factorial of no:"+fact(n));
        int f=fact(n);
        System.out.println("No of trailing zeros:"+trailZero(f)); //works  upto n=12 as n increaces  factorraicl is greateg than limit
        //of int so will give wrong ans use  efficTrailZero method
        System.out.println("efficTrailZero:"+efficTrailZero(n));  //5pow(k) <= n    ==>  k=log n base 5  ==>  Theata(log(n)  
       
    }
    static int fact(int n){
     int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
    return fact;
}
    static int trailZero(int f){
        int c=0;
            while(f%10==0){
                f=f/10;
                c++;
            }
          return c;    
     }
     static int efficTrailZero(int f){
        int z=0;
        for(int i=5;i<=f;i=i*5){
            z=z+f/i;
        }
    return z;
     }
}
