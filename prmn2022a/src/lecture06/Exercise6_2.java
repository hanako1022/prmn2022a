package lecture06;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            Integer a = random.nextInt(6)+1;
            list.add(a);
        }

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("さいころを５つ振りました");
            System.out.println("何番目の値を確認しますか？");
            int b = input.nextInt();
                System.out.println(list.get(b-1));


        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました");
            System.out.println("プログラムを終了します");
        }
    }
}
