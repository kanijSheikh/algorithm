package multithreading.WaitNotifyNotifyAll;// Unpublished Work (c) 2017 Deere & Company

import multithreading.ThreadJoinExample;

public class Notifier implements Runnable {
    private Message message;

    public Notifier(Message msg){
        this.message = msg;

    }
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
            synchronized (message) {
                message.setMsg(name+" Notifier work done");
                message.notify();
                //message.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}