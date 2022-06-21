import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Main { 
     public static void main(String[] args){
          int[] grades = {1, 2, 3, 72, 55, 1, 25, 98};     
            Arrays.sort(grades);// we can use also Array.parallelSort(arrayName)
       System.out.println(Arrays.toString(grades));
         
     }
}
 // Result:
// [1,1, 2, 3, 25, 55, 72, 98]
