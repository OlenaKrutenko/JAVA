// set two strings, write a word in the second line in uppercase and replace the word “fine” with the word “sunny” in the first line, and determine the length of a new line.
public class Main{
    public static  void main (String[] args){
   String str1 = "The weather is fine.";
      char[] arrStr = {'s', 'u', 'n', 'n', 'y'};
      String str2 = new String (arrStr);
      System.out.println("Old Spring:"  +  str1);
      String str1_changed = str1.replace("fine", str2.toUpperCase());
      System.out.println("Changed string will be: "  +  str1_changed);
        System.out.println("Length of new string is"  +  str1_changed.length());  
    }
}
