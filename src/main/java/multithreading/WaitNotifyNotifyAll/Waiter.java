package multithreading.WaitNotifyNotifyAll;// Unpublished Work (c) 2017 Deere & Company

public class Waiter implements Runnable {
    private Message message;

    public Waiter(Message msg){
        this.message = msg;
    }

    public void run() {

        String name = Thread.currentThread().getName();
        synchronized (message){
            try {
                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
                message.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
            //process the message now
            System.out.println(name+" processed: "+message.getMsg());


        }

    }
}
