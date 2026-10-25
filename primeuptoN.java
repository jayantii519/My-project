public class primeuptoN {
  public static void main(String[]args){
   int n =10;
   
  for(int num = 2; num <= n; num++){          // outer loop for selecting numbers
   int  count = 0 ;                           // reset divider
    
    for(int i = 2; i < num; i++)            // inner loop for checking 
    if(num % i== 0)
    count ++;
  
   if (count == 0)
    System.out.println(num);
   }
  }
}
