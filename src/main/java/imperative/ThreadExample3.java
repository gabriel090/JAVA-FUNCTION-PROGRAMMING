package imperative;
/*
* Create runnable as an annonimous class
* */
public class ThreadExample3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Third runnable start");
                System.out.println("Third runnable stop");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
