public class Chronometer implements Runnable{

    private Thread thread;
    private String threadName;

    public Chronometer(String threadName){
        this.threadName = threadName;
        System.out.println("Thread is being created : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Thread is being executed : " + threadName);
        // TODO
        for(int i = 1; i <= 100; i++){
            System.out.println(threadName + " : " + i);
        }

        System.out.println("Thread completed : " + threadName);

    }

    public void start(){
        System.out.println("Thread object is being created");
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
