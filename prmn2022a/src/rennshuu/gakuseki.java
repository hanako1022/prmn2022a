package rennshuu;

public class gakuseki {
    private String bangou;
    private String name;
    private  int age;

    public gakuseki(String bangou,String name,int age){
        this.bangou = bangou;
        this.name = name;
        this.age = age;

    }

    public boolean handan(){
        if(age >= 20){
            return true;
        }else{
            return false;
        }
    }


}
