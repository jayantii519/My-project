public class PrimeCheck {
 public static void main(String[] args){
 int num = 7;
 Boolean isprime = true;

 if(num <= 1){
 isprime = false;
 }
 else{
     for(int i= 2; i < num; i++){
     if(num % i == 0){
      isprime = false;
    }
     }
    }
  
    if(isprime){
  System.out.println(num + "is prime no.");
    }
    else{
  System.out.println(num + "is not prime no.");
    }
} 
 }
