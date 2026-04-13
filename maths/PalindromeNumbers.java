import java.util.Scanner;  

class PalindromeNumbers {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      int  x=sc.nextInt();
      System.out.println(isPalindrome(x));
    }
    
   static Boolean isPalindrome(int x){
        int temp=x;
        int rev=0;
        boolean flag=false;
        while(temp>0){
            int c=temp%10;
            rev=rev*10+c;
            temp=temp/10;
        }
       if(x==rev){
          flag=true;
       } 
       return flag;
    }
}

