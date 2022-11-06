package lecture02;
import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("氏名を入力してください");
        String name = input.nextLine();
        System.out.println("年齢を入力してください");
        int age = input.nextInt();
        Human hu = new Human(name,age);
        hu.print();

    }
}
