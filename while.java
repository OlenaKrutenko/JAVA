while  (conditional expression) { 
    /*statements*/
}

class TestWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }
}
////
do  {
    /*statements*/
}while (conditional expression);

//////
class TestDoWhile  {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i > 5 && i < 10);
    }
}


// BREAK
public static void main(String[] arg) {
    int i = 0;
    while (true) {
        if (i > 6) {
            break;
        }
        System.out.println(i++);
    } 
}


