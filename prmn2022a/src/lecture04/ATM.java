package lecture04;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    private List<Account> accountList;

    private Scanner input = new Scanner(System.in);

    public ATM() {
        accountList = new ArrayList<>();
    }

    public void registerAccount(String name, String number) {
        Account ac = new Account(name, number);
        if (existsAccount(name, number)) {
            System.out.println("そのアカウントは存在しています");
        } else {
            System.out.println("氏名：" + name + "番号：" + number + "が存在しなかったため登録しました");
            accountList.add(ac);
        }

    }

    public boolean existsAccount(String name, String number) {
        for(Account ac:accountList) {
            if (ac.getName().equals(name) && ac.getNumber().equals(number)  ) {
                System.out.println("存在した！");
                return true;
            } else {
                System.out.println("a");
                return false;
            }
        }
        return false;
    }

    public long deposit(String number, long money) {
        for (Account ac : accountList) {
            if (ac.getNumber().equals(number)){
                long nokori = ac.getBalance() + money;
                ac.setBalance(nokori);
                System.out.println("残高は" + nokori + "円です");
                return nokori;
            } else {
                System.out.println("番号がありません");
                return 0;
            }
        }
        return 0;
    }

    public long withdraw(String number, long money) {

        for (Account ac : accountList) {
            if (ac.getNumber().equals(number)) {
                long nokori = ac.getBalance() - money;
                if (nokori < 0){
                    System.out.println("お金がありません");
                    return 0;
                } else {

                    ac.setBalance(nokori);
                    System.out.println(money + "円引き出しました");
                    System.out.println("残高は" + nokori + "円です");
                    return money;

                }
            } else {
                System.out.println("番号がありません");
                return 0;
            }
        }
        return 0;
    }
}

