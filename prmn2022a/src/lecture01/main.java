package lecture01;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("B2210240 ito haru");

        int studentNumber = 2210240;

        System.out.println("B"+ studentNumber +" ito haru");

        System.out.println("年齢を入力してください");
        int age = scanner.nextInt();

        if(age<20) {
            System.out.println("I am " + age + "years old so I cannot drink liquor.");
        }else{
            System.out.println("I am " + age + " years old so I can drink liquor. ");
        }
        int[] array = new int[100];

        int count = 0;
        int sum = 0;

        for(int i = 0; i < array.length;i++){
           array[i] = i + 1;
           if(array[i]%2 == 0) {

               sum = sum + array[i];
           }
        }
        System.out.println(sum);

        int[] score = {41,85,72,38,80};
        for(int i = 0;i < score.length;i++){
            System.out.print(i + "番" + score[i] +"点 " );
            if(score[i]<60){
                System.out.println("不可");
            }else if(score[i] < 70){
                System.out.println("可");
            }else if(score[i] < 80){
                System.out.println("良");
            }else if(score[i] < 90){
                System.out.println("優");
            }else{
                System.out.println("秀");
            }
        }
        System.out.println("最高点：" + max(score));
        System.out.println("最低点：" + min(score));
        System.out.println("平均点：" + average(score));
    }
    private static int min(int score[]){
        int j = 0;
        for(int i = 1;i < score.length;i++){
            if(score[j] > score[i]){
                j = i;
            }
        }
        return score[j];
    }
    private static int max(int score[]){
        int j = 0;
        for(int i = 1;i < score.length;i++){
            if(score[j] < score[i]){
                j = i;
            }
        }
        return score[j];
    }
    private static double average(int score[]){
        int sum = 0;
        for(int i = 0;i < score.length;i++){
             sum = sum + score[i];

        }
        return (double)sum/score.length;
    }
}
