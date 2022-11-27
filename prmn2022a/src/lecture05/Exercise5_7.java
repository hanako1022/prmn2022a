package lecture05;

import java.util.ArrayList;
import java.util.List;

public class Exercise5_7 {
    public static void main(String[] args) {
        Insect in = new Insect();
        Butterfly bu = new Butterfly();
        Locust lo = new Locust();
        SwallowtailButterfly swa = new SwallowtailButterfly();
        ArrayList<Insect> list = new ArrayList<>();
        list.add(in);
        list.add(bu);
        list.add(lo);
        list.add(swa);

        for(Insect a:list) {
            a.move();
        }

    }
}
