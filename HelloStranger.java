import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scanner = new Scanner (System.in);
        int count = scanner.nextInt();
        if (count==0) {
            System.out.println("Oh, it looks like there is no one here");
        }else if (count<0){
            System.out.println("Seriously? Why so negative?");
        } else {
            String[] names = new String[count];
            for (int i=0; i<count; i++) {
                Scanner input = new Scanner(System.in);
                names[i] = input.nextLine();
            }
            for (int j=0; j< names.length; j++) {
                System.out.println("Hello, " + names[j]);
            }

        }
    }
}
