package imperative;

public class ThreadExample5StopThread {
    public static class StopRunnable implements  Runnable{
        private boolean stopRequest = false;

        public synchronized void requestStop(){
            this.stopRequest = true;
        }
        public synchronized  boolean isStopRequested(){
            return  this.stopRequest;
        }
        private void  sleep(long millis){
            try{
                Thread.sleep(millis);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        @Override
        public void run() {
            System.out.println("StoppableRunnable Start");
            while (!isStopRequested()){
                sleep(1000);
                System.out.println("....");
            }
            System.out.println("StoppableRunnable Ending");
        }

    }
    public static void main(String[] args) {
        StopRunnable  stopRunnable = new StopRunnable();
        Thread thread = new Thread(stopRunnable, "The Thread");
        thread.start();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("requesting stop");
        stopRunnable.requestStop();
        System.out.println("Stop requested");
    }
}
