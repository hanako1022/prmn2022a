package com.example.linebot.replier;

import java.util.Calendar;

import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.message.Message;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Menu implements Replier{
    private  String name;



    public Menu(){
        name = "今日のメニューは";
    }

    @Override
    public Message reply() {
        try {
            ArrayList<Ryouri> menuList = new ArrayList<>();
            FileManager fileManager = new FileManager("menu1.txt");
            String[] lines = fileManager.getAsArray();

            for (String line : lines) {
                menuList.add(new Ryouri(line));
                System.out.println(menuList.size());
            }


        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);//1:日曜日、２：月曜日、３：火曜日、４：水曜日、５：木曜日、６：金曜日、７：土曜日


        for (Ryouri list : menuList) {
               if(list.getMenu(name,week) != null){
                   this.name = list.getMenu(name,week);
               }
        }
        return new TextMessage(name);

        } catch (IllegalArgumentException e1) {
            System.out.println("ファイル名を正しく入力してください");
        } catch (IOException e2) {
            System.out.println("ファイルが読み込めません");
        }
        return new TextMessage("a");
    }
}
