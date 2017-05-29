package multithreading.WaitNotifyNotifyAll;// Unpublished Work (c) 2017 Deere & Company

public class WaitNotifyTest {

    public static void main(String args[]){
        Message message = new Message("New Message");
        Waiter waiter = new Waiter(message);
        new Thread(waiter,"waiter").start();

        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1,"waiter1").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier, "notifier1").start();

        System.out.println("All threads are started");
    }

}
