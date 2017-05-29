package multithreading;// Unpublished Work (c) 2017 Deere & Company

public class ThreadRunTest {

    public static void main(String args[]){
        Thread t1 = new Thread(new MyRunnableThread(), "t1");
        Thread t2 = new Thread(new MyRunnableThread(), "t2");

        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");

        MyThread t3 = new MyThread("t3");
        MyThread t4 = new MyThread("t4");

        System.out.println("Starting MyThreads");
        t3.start();
        t4.start();
        System.out.println("MyThreads has been started");

    }
}
