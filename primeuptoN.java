public class primeuptoN {
  public static void main(String[]args){
   int n =10;
   
  for(int num = 2; num <= n; num++){
   int  count = 0 ;
    
    for(int i = 2; i < num; i++)
    if(num % i== 0)
    count ++;
  
   if (count == 0)
    System.out.println(num);
   }
  }
}
