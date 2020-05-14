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
                    //kui süsteem runnib siis saab sisestada uue nime
                    String newName;
                    System.out.println("LISA uus inimene: ");
                    //uusnimi = scanneriga ehk lisandub inimeste listi
                    newName = in.nextLine();
                    // kui sisestatud nimi on tühi ehk nime ei kirjutata, siis 
                    if(newName.equals("")) {
                        // siis süsteem läheb kinni, 
                        appSystem.end();
                        in.close();
                    } else {
                        System.out.println("LISA Lisati inimene nimega: " + newName);
                        // kui pole tühi siis võtan getpeople, siis on jubaligipääs listile. Lisan uue nime sinna
                        appSystem.getPeople().add(newName);
                    }

                    // thread sleep, iga kord kui loop on läbitud küsib 1sekundi pärast uuesti
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
            System.out.println("ADD: Thread " + tName + " starting");
            //kontrollin kas thread mille siin olen ära määranud on võrdne nulliga
            if(thread == null) {
                thread = new Thread(this, tName);
                thread.start();
            }
        }


}
