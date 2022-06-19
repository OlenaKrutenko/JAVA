import java.util.Scanner;

public class Main{
    public static  void main (String[] args){
    int i;
    int j;

      for(i = 2;i<=3;i++)
      {
        System.out.println("Table of" + i);
        for (j = 1;j<=10;j++)
        {
          System.out.println(i + "*" + j + "=" + (i*j));
        }
      }
      
           
    }
}
