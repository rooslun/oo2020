package app.app;
//game.java
// siin failis loos programmi põhja
// selleks et oma mythreadi käivitada pean looma ka siin appaddthreadi
public class MyApp {

    private AppSystem aSystem = new AppSystem();
    private AppAddThread addThread;
    private AppInfoThread infoThread;

    public MyApp() {
        addThread = new AppAddThread("Add thread", aSystem);
        infoThread = new AppInfoThread("Info thread", aSystem);
    }

    // teen ka siin objektis ühe start funktsiooni, ta alustab threadi
    public void start() {
        addThread.start();
        infoThread.start();
    }
}