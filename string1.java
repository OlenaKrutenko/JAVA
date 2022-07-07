//String Length. A String in Java is actually an object, which contain methods that can perform certain operations on strings.
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());


//string methods: toUpperCase() and toLowerCase():
String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"


//The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7

//Java counts positions from zero.0 is the first position in a string, 1 is the second, 2 is the third ...
