import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        int sec = seconds % 60;
        int min = (seconds/ 60)%60;
        int hours = (seconds/60)/60;

        String strSec=(sec<10)?"0"+Integer.toString(sec):Integer.toString(sec);
        String strMin=(min<10)?"0"+Integer.toString(min):Integer.toString(min);
        String strHours=(hours<10)?Integer.toString(hours):Integer.toString(hours);

        System.out.println(strHours + ":" + strMin + ":" + strSec);



    }
}
