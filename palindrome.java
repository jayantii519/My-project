public class palindrome{
   public static void main(String[]args){
   int n = 656, temp, rev = 0,d ;
   d = n ;   // for  
    //loop to reverse the no. 
   while(n > 0){       
   temp = n % 10 ;
   rev = rev * 10 + temp;
   n = n / 10;
   }

   if(d == rev)
 System.out.println(rev +"is Palindrom");
 else
   System.out.println(rev +"is not palindrome");
   }
}
