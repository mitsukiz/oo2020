public class App {
    public static void main(String[] args) throws Exception {
        MyThread myThread1 = new MyThread("Thread 1", 1000);
        MyThread myThread2 = new MyThread("Thread 2", 600);
        myThread1.start();
        myThread2.start();
    }
}