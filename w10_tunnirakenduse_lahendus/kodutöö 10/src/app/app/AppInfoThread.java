package app.app;
// Siin arvutan hetkel olemas olevate inimeste arvu 



public class AppInfoThread implements Runnable {

    private String tName;
    private Thread thread;

    // kuna tahan kontrollida kas inimeste arv on üldse muutunud kui hetke arvu välja prindin
    // pean lisama selleks veel ühe muutuja
    private int arv;

    private AppSystem aSystem;

    public AppInfoThread(String name, AppSystem aSystem) {
        tName = name;
        this.aSystem = aSystem;
        arv = 0;
        

    }

    @Override
    public void run() {
        try {
            while(aSystem.isRunning()){
                // vaatan kas arv on üldse muutunud
                if (aSystem.getPeople().size() > arv) {
                // prindin inimeste arvu välja
                System.out.println("INFO : Hetkel olemas olevate inimeste arv : " + aSystem.getPeople().size());
                // annan arvumuutujale uue väärtuse
                arv = aSystem.getPeople().size();
                }
                Thread.sleep(5000);
            
            }
            //kui midagi juhtub siis see püütakse kinni
        } catch (InterruptedException e) {
            //Tkirjutan juurde ka errori, kui tuleb
            System.out.println("INFO : Thread " + tName + " Lõppes");
        }

    }

    //teen threadi algus funktsioon
    public void start() {
        System.out.println("INFO : Thread " + tName + " Algab");
        //kontrollin kas thread mille siin olen ära määranud on võrdne nulliga
        if(thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }

}