package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
         ATM atm = new ATM();


        atm.registerAccount("はなお","1");
        atm.existsAccount("はなお","1" );
        atm.deposit("1",1000);
        atm.withdraw("1",2000);
        atm.withdraw("1",500);

    }
}
