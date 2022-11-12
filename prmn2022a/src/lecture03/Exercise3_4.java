package lecture03;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {
        ArrayList<Vegetable> list = new ArrayList<>();
        list.add(new Vegetable("人参",117));
        list.add(new Vegetable("玉ねぎ",120));
        list.add(new Vegetable("じゃがいも",154));
        for(Vegetable lists : list){
                 lists.print();
        }
    }

}
