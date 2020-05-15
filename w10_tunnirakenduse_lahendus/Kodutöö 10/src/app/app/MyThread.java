package app.app;

public class MyThread implements Runnable {

    private Thread thread;
    private String tName;

    private int inter;

    // alguses teen konstraktori
    public MyThread(String tName, int inter) {
        this.tName = tName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(tName + ": " + i);
                // 1000millisekundites - iga sekundi tagant prindib välja
                Thread.sleep(1000);
            }
            //kui midagi juhtub siis see püütakse kinni
        } catch (InterruptedException e) {
            //Tkirjutan juurde ka errori, kui tuleb
            System.out.println("Thread " + tName + " dead");
        }

    }
    

    //teen threadi algus funktsioon
    public void start() {
        System.out.println("Thread" + tName + "starting");
        //kontrollin kas thread mille siin olen ära määranud on võrdne nulliga
        if(thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }

}