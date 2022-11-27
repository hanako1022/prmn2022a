package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
         Fighter fi1 = new Fighter(200,20,"Fighter1");
         Fighter fi2 = new Fighter(180,25,"Fighter2");

         while(true) {
             fi1.attack(fi2);
             if(fi2.isAlive()) {
                 System.out.println(fi2.getName() + "ののこりHPは" + fi2.getHitPoint());
             }else{
                 System.out.println(fi2.getName() + "は倒れた");
                 break;
             }
             fi2.attack(fi1);
             if(fi1.isAlive()) {
                 System.out.println(fi1.getName() + "ののこりHPは" + fi1.getHitPoint());
             }else{
                 System.out.println(fi1.getName() + "は倒れた");
                 break;
             }
         }
    }
}
