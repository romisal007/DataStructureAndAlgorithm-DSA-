import java.util.Scanner;  

class CountDigits {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String  a=sc.nextLine();
      System.out.println(a.length());
      
      Scanner sc = new Scanner(System.in);
      int  x=sc.nextInt();
      int c=0;
      while(x>0){
          x=x/10;
          c++;
      }
      System.out.println(c);      
      
    }
}
