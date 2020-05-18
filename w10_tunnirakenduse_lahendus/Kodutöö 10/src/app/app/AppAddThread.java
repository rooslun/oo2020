package app.app;

import java.util.Scanner;

public class AppAddThread implements Runnable {

    private String tName;
    private AppSystem appSystem;

    private Thread thread;


 //konstraktor kuhu annan kaasa nime ja viide appsüsteemile
 public AppAddThread(String name, AppSystem aSystem) {
    tName = name;
    appSystem = aSystem;
}

@Override
public void run() {
        // meil on vaja saada kasutajalt sisendit, seda teen scanneriga
        Scanner in = new Scanner(System.in);

            try {
                // meie programm töötab while loopiga
                while(appSystem.isRunning()) {
                    //kui süsteem runnib siis saab sisestada uue puuvilja
                    String newName;
                    System.out.println("Lisa uus puuvili: ");
                    //uusnimi = scanneriga ehk lisandub puuviljade listi
                    newName = in.nextLine();
                    // kui sisestatud nimi on tühi ehk vilja ei kirjutata, siis 
                    if(newName.equals("")) {
                        // siis süsteem läheb kinni, 
                        appSystem.end();
                        in.close();
                    } else {
                        System.out.println("Lisati uus puuvili: " + newName);
                        // kui pole tühi siis võtan getfruits, siis on jubaligipääs listile. Lisan uue vilja sinna
                        appSystem.getFruits().add(newName);
                    }

                    // thread sleep, iga kord kui loop on läbitud küsib 2sekundi pärast uuesti
                    Thread.sleep(2000);
                }
                
                //kui midagi juhtub siis see püütakse kinni
            } catch (InterruptedException e) {
                //Tkirjutan juurde ka errori, kui tuleb
                System.out.println("LISA Thread " + tName + " dead");
            }

    }

        //teen threadi algus funktsioon
        public void start() {
            System.out.println("ADD: Thread " + tName + " Algab");
            //kontrollin kas thread mille siin olen ära määranud on võrdne nulliga
            if(thread == null) {
                thread = new Thread(this, tName);
                thread.start();
            }
        }


}
