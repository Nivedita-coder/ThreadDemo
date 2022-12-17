//// In this code both Hi and Hello are not dependent aka parallel so do this we we'll do in other code
//
//class Hey {
//    public void show(){
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Hi");
//           try {Thread.sleep(500);} catch (Exception e){}
//        }
//    }
//}
//class Holla {
//    public void show(){
//        for (int i = 1; i <= 5 ; i++) {
//            System.out.println("hello");
//            try {Thread.sleep(500);} catch (Exception e){}
//        }
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        Hey obj1 = new Hey();
//        Holla obj2 = new Holla();
//
//        obj1.show();
//        obj2.show();
//    }
//}
