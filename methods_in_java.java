1. public double raiseNumber(double num, double power);

~public class Main {
       	public double raiseNumber (double num, double power){
		            return (Math.pow(num,power));
			        }

  public static void main(String []args) {
    Main obj = new Main(); // creating object for calling the method

  double result = obj.raiseNumber(5,3); //first invoking the method
      System.out.println("Result of (5^3): "+result);

  System.out.println("Result of (10^4): "+obj.raiseNumber(10,4)); //second invoking
							    }
}

//The result:

//Result of (5^3): 125.0
//Result of (10^4): 10000.0
