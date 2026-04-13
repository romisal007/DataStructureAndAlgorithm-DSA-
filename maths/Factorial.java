// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Factorial of no:"+fact(n));
        System.out.println("Factorial of no using Recursive:"+factRec(n));
    }
    static int fact(int n){
     int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
    return fact;
}
 static int factRec(int n){
    if(n==0)
     return 1;
    else return n*fact(n-1);
 }
}
