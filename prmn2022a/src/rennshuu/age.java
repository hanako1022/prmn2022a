package rennshuu;

public class age {
    private int value;

    public age(int value){
        if(value >= 0 && value <= 130){
            this.value = value;
            return;
        }

        throw new RuntimeException(value + "不正な年齢");
    }

}
