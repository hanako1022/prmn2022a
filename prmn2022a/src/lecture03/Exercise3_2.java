package lecture03;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercise3_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    System.out.println("何行文入力しますか？：");
    int i = input.nextInt();
    for(int j = 0;j < i + 1;j++){

       if(j != 0) {
           System.out.print(j + "行目:");
       }
        String c = input.nextLine();
        list.add(c);



    }
        System.out.println("入力した文字列");
    for(String bun : list){

        System.out.println(bun);
    }

    }
}
