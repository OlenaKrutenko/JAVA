
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       // int[] grades = new int [10];// initialization of an array with the number of elements 10
      int [] grades = {12, 2, 3, 8, 9, 6,7, 8, 9, 5};
      //grades [0] = 12;
      grades [3] = 78; //Replace the third element of the array with 78
      System.out.println(grades[3]);
      System.out.println(Arrays.toString(grades));//displays all elements of the array
    }
}
