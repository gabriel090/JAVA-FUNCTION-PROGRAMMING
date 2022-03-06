package imperative;
/*Implement runnable with java Lambda expression

*
* */
public class ThreadExample4 {
    public static void main(String[] args) {
        Runnable runnable = ()->{
           // String threadname = Thread.currentThread().getName();
            System.out.println("Lambda expression start ");

            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Lambda expression finnish ");
        };
        Thread thread = new Thread(runnable,"Demo test ");
        thread.start();

    }
}
