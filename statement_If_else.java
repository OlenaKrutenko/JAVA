import java.util.Scanner;

public class Main { 
     public static void main(String[] args) {
	     String password = "Olena";
             System.out.println("Guess the password: ");
             Scanner scanner = new Scanner (System.in);
     	        String guess = scanner.nextLine();
       	       System.out.println(password.equals(guess));
                 if (password.equals(guess)) {
               System.out.println("Your guess is correct");
             }  else if ("Apple".equals(guess)) 
             {
               System.out.println("You got second password");
              } else {
            System.out.println("Answer is wrong"); 														          }
       }
}

