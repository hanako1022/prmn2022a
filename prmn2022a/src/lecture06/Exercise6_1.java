package lecture06;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0;


            try {
                System.out.println("小数値を入力してください");
                a = input.nextDouble();
                System.out.println("入力した値は" + a + "です");

            } catch (InputMismatchException e) {
                System.out.println("エラー");
            }






    }
}
