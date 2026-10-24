public class Ndigitsum {
  public static void main(String[] args){
  int n = 123 ,sum = 0 ;
  
 while(n > 0){
  int digit = n % 10; // Get the last digit
  sum = sum + digit;  // add digit to sum
  n = n / 10;          // remove it from actaul num
 }
System.out.println("sum of digits is : " +sum);

  }
}
