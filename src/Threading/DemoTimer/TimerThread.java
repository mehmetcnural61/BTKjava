package Threading.DemoTimer;

public class TimerThread implements Runnable {

    private Thread thread;
    private String threadName;

    public TimerThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating... " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Starting... " + threadName);

        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " : "+i);
                Thread.sleep(1000);
                //yaz bir saniye bekle
            }

        } catch (InterruptedException exception) {
            System.out.println("Error Interrupted.. "+threadName);
        }

        System.out.println("Thread Mission Completed: "+threadName);


    }
    public void start(){
        System.out.println("Thread object is creating ");
        if (thread==null){
            thread =new Thread(this,threadName);
            thread.start();
        }
    }
}
