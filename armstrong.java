public class armstrong {
  public static void main(String[]args){
   int n = 153, sum=0, d;
   int temp=n;
   while(n>0){
    d= n%10;
    sum= sum + (d*d*d);
    n=n/10;
   }

   if(temp==sum)
  System.out.println(temp + "is a armstrong no.");
else
  System.out.println(temp +"is not a armstrong");

  }
}
