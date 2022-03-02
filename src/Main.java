public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Đen");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Trắng");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
