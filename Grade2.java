public class Grade2 {
  public static void main(String[] args){
   //
   int marks = 90;
   int grade;
   
   if(marks >= 90){
    grade = 1;
   }
   else if (marks >= 70){
    grade = 2;
   }
   else if (marks >= 60){
    grade = 3;
   }
   else if (marks >= 50){
    grade = 4;
   }
   else{
    grade = 5;
   }

  switch (grade) {

  case 1: System.out.println("grade A");
          break;

  case 2: System.out.println("grade B");
          break;

  case 3: System.out.println("grade C");
          break;

  case 4:System.out.println("grade D");
          break; 

  case 5:System.out.println("grade F");        
        
  default:
          System.out.println("invalid grade");  
  }
}
}