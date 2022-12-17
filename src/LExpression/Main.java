package LExpression;

public class Main {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("I'm Roti!");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("I'm Bella!");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}

