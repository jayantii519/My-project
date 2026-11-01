public class Fibonacci {
  public static void main(String []args){
  int n=6,a=0,b=1,c; //starting vales

System.out.println("Checking the fibonacci series");
for(int i=1; i<=n; i++){
  System.out.print(a + " ");
  
  c = a + b;
  a = b;
  b = c;
}

  }
}
