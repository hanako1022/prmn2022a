package lecture03;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercise3_3 {
    public static void main(String[] args) {
        int[] j;
        j = new int[2];

        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for(int i = 0;i < 2;i++){
            System.out.println(i + 1 + "つ目の文字列を入力してください");
            list.add(input.nextLine());
        }
        int b = 0;
        for(String bun:list){
            j[b] = Integer.parseInt(bun);
            b++;
        }

        int c = j[0] + j[1];
        System.out.println(j[0] + "+" + j[1] + "=" + c);
    }
}
