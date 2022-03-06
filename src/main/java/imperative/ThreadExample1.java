package imperative;

public class ThreadExample1 {
    public static class MythreadClass extends Thread{
        public void run(){
            System.out.println("Mythread running ");
            System.out.println("Mythread finnished");
        }
    }

    public static void main(String[] args) {
        MythreadClass mythreadClass = new MythreadClass();
        mythreadClass.start();
    }
}
