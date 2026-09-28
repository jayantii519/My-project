public class Triangle {
public static void main(String[] args){ 

int a = 3, b = 4, c = 5;

if ((a + b > c) && (a + c > b) && (b + c > a)) {

    System.out.println("Triangle is valid");

    if ((a == b) && (b == c)) {
        System.out.println("Equilateral");
    }

    else if ((a == b) || (b == c) || (a == c)) {
        System.out.println("Isosceles");
    }

    else {
        System.out.println("Scalene");
    }
}

else {
    System.out.println("Triangle is invalid");
}
}}


