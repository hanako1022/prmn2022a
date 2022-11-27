package lecture04;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] args) {
         ATM atm = new ATM();
        Scanner input = new Scanner(System.in);

        atm.registerAccount("はなお","1");
        atm.existsAccount("はなお","1" );
        atm.deposit("1",1000);
        atm.withdraw("1",2000);
        atm.withdraw("1",500);

    }
}
