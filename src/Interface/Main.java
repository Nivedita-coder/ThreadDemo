package Interface;
class Girl implements Runnable{
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("I'm Girl!");
            try {Thread.sleep(500);} catch (Exception e){}
        }
    }
}
class Boy implements Runnable{
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("I'm Boy!");
            try {Thread.sleep(500);} catch (Exception e){}
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Runnable obj1 = new Girl();
        Runnable obj2 = new Boy();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {Thread.sleep(10);} catch (Exception e){}
        t2.start();
    }
}
