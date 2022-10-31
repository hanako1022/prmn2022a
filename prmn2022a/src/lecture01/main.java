package lecture01;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("B2210240 ito haru");

        int studentNumber = 2210240;

        System.out.println("B"+ studentNumber +" ito haru");

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
    }


}
