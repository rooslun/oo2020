package app.app;

import java.util.ArrayList;
import java.util.List;
// siin programm elab
public class AppSystem {

    private boolean running; // vaatab kas meie app töötab
    // teen ka listi kuhu hakata puuvilju lisama
    private List<String> fruits = new ArrayList<>();

    public AppSystem() {
        running = true;
    }
    // loon konstraktori
    // loon paar funktsiooni mida programmid kasutaksid


    public boolean isRunning() {
        // kui runnib, tagastab running booleani
        return running;
    }

    // kui enam ei runni siis programm lõppeb ära
    public void end() {
        running = false;
    }

    public List<String> getFruits() {
        return fruits;
    }

}