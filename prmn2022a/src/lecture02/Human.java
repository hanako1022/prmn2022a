package lecture02;

public class Human {
    String name;
    int age;

    Human(String name,int age){
       this.name = name;
       this.age = age;
    }

    void print(){
        if(age <= 18){
            System.out.println("生徒氏名：" + name + " 　年齢：" + age);
        }else if(age <= 22){
            System.out.println("学生氏名：" + name + " 　年齢：" + age);
        }else {
            System.out.println("氏名：" + name + " 　年齢：" + age);
        }
    }
}
