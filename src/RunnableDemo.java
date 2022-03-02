public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Tạo con mèo  " + threadName);
    }

    public void run() {
        System.out.println("Mèo chạy " + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Mèo: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Mèo  " + threadName + " interrupted.");
        }
        System.out.println("Mèo " + threadName + " exiting.");
    }
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

