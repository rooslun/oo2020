package app.app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello java");
            // loome threadid ja kutsun neid välja nii nagu objekte
            
            /*MyThread myThread1 = new MyThread("Thread 1", 1000);
            MyThread myThread2 = new MyThread("Thread 2", 600);
            myThread1.start();
            myThread2.start();     */

            
            MyApp app = new MyApp();

            app.start();
            

    }
}
