public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scan = new Scanner(System.in);
        int bill = scan.nextInt();
        int people = scan.nextInt();
        if (bill < 0) {
            System.out.println("Bill total amount cannot be negative");
        }

        else if (people <= 0){
            System.out.println("Number of friends cannot be negative or zero");
        }else
        {
            System.out.println((bill + bill/10)/people);
        }
    }
}

