public class ReverseofN {
   public static void main(String[]args){
   int n = 435, rev = 0, temp ; 
   
   while (n > 0 ){
   temp = n % 10 ;
   rev = rev * 10 + temp;
   n = n / 10;
    }

System.out.println( "reverse of a no. is " + rev);
  }
}
