package com.example.linebot.replier;

public class Ryouri {

    private String name;
    private String number;
    private String value;

    public Ryouri(String arg){
        if(arg == null){
            throw new RuntimeException();
        }
        String[] splitted = arg.split(",");
        this.name = splitted[0];
        this.value = splitted[1];
        this.number = splitted[2];
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public String getValue(){
        return value;
    }

    public String getMenu(String name,int day){
        String da = String.valueOf(day);
        if(this.number.equals(da)){
            String na = name +":" +  this.name;
            return na;
        }
        return null;
    }

}
