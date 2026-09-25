public class Swap {
     
    public static void main(String[] args){
      int a = 5, b = 2;
      
      a = a + b;    // this line tells let swap the value without third variable.
      b = a - b;
      a = a - b;

      System.out.println("After swapping a and b: ");
      System.out.println("a= " +a);
      System.out.println("b= " +b);
    }
}
