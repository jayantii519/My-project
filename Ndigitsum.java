public class Ndigitsum {
  public static void main(String[] args){
  int n = 123 ,sum = 0 ;
  
 while(n > 0){
  int digit = n % 10; // Gives the last digit
  sum = sum + digit;  // add  it to sum
  n = n / 10;         // update the original no. ex:123-> 12,removed 3!
 }
System.out.println("sum of digits is : " +sum);

  }
}
