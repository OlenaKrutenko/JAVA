//Consider recursion on a more efficient example of finding the greatest common divisor. The program takes two positive integers as input from a user and calculates GCD using recursion.
import java.util.Scanner;

public class Main{
   static int calculateGCD(int num1, int num2) {
    if (num2 != 0)
        return calculateGCD(num2, num1 % num2);
    else
        return num1;
  }
    public static  void main (String[] args){
      System.out.println("Enter the first positive value: ");
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
       System.out.println("Enter the second positive value: ");
      int num2 = sc.nextInt();
      System.out.println("The greter common divisor of " + num1 + " and " + num2 + " is " + calculateGCD (num1,num2));
  
   
    }

}
//result:
//Enter the first positive integer value: 450
//Enter the second positive integer value: 233
////The greatest common divisor of 450  and 233  is 1

