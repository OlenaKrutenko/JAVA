import java.util.Scanner;
 
public class Main {
        public static void main (String[] args){
            String choice;
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you prefer?");
            System.out.println("1 a candy");
            System.out.println("2 chocolate");
            System.out.println("3 a cake ");
            System.out.println("Enter your choice:");
            choice = sc.nextLine();
            switch(choice)
            {
                case "1":
                    System.out.println("You need 5 dollars.");
                    break;
                case "2":
                    System.out.println("You need 10 dollars.");
                    break;
                case "3":
                    System.out.println("You need 15 dollars.");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
}
