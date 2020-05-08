package app;import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));

        //aatommass ja järjek number
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        Ioon Hapnik = new Ioon("O", -2, 16);
        Ioon Lämmastik = new Ioon("N", -3, 14);
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Magneesium = new Ioon("Mg", 12, 24);

        //Lisan kõik ained ühte listi, loe sisse filest
        List<Ioon> Ioonid = new ArrayList<>();

        Ioonid.add(Magneesium);
        Ioonid.add(Kloriid);
        Ioonid.add(Hapnik);
        Ioonid.add(Lämmastik);
        Ioonid.add(Naatrium);
        //Ioonid.add(Süsinik);
        //Ioonid.add();
        Ioonid.add(Kaltsium);

        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
 // Küsi sisse vajalik info
        while(running) {
            List<Ioon> IoonInput = new ArrayList<>();

            System.out.println("Siin sul on võimalik liita kokku kaks iooni ja saada teada kas neid on võimalik kokku liita ja saada aine ");
            System.out.println(" ");
            System.out.print("Valikus on sellised ained: ");
            for(Ioon ioon : Ioonid){
                System.out.print(ioon.getNimi() + " ");
            }
            System.out.println(" ");
            System.out.println("Mitmest ioonist soovid ainet koostada? (1-6) : ");
            //int n = input.nexline ja kntrl kas on olemas aine ja kas sisestas numbri
            int n = input.nextInt();
            input.nextLine();
            String fileInfo = "";
            for(int i = 0; i < n; i++) {
                boolean correct = false;
                while(!correct) {
                    System.out.println("Sisestage ioon: ");
                    //error notification 
                    String temp = input.nextLine();
                    int ok = kntroll(temp, Ioonid);
                    if(ok > 0){
                        correct = true;
                        fileInfo += temp + " ";
                    }else{
                        System.out.println("Sellist iooni ei ole valikus!"); //error notification
                    }
                }
            }
            System.out.println(fileInfo);
            writer.append(fileInfo);
            writer.newLine();

            // Kas lisab veel ained v piisab 

            System.out.println("Kas soovid lisada veel ühe aine? (jah/ei)");
            String temp = input.nextLine();

            if(temp.equals("ei")){
                running = false;
            }

        }

        
        writer.close();
        String line = reader.readLine();
        //while (line == null){
        while (line != null){

            List<Ioon> ained = new ArrayList<>();
            String[] molekul = line.split(" ");
            for(int i = 0; i < molekul.length; i++){
                if(molekul[i].equals("Ca")){
                    ained.add(Kaltsium);
                }else if(molekul[i].equals("Cl")){
                    ained.add(Kloriid);
                }else if(molekul[i].equals("O")){
                    ained.add(Hapnik);
                }else if(molekul[i].equals("Na")){
                    ained.add(Naatrium);
                }else if(molekul[i].equals("N")){
                    ained.add(Lämmastik);
                }else if(molekul[i].equals("Mg")){
                    ained.add(Magneesium);
                }
            }
            AineSec Aine = new AineSec(ained);

            System.out.print("Ioonid: ");
            for(int i = 0; i < molekul.length; i++){
                System.out.print(molekul[i] + " ");
            }

/*
            System.out.println("");
            if(Aine.getNimi() != null){
                System.out.println("Sinu loodud aine: " + Aine.getNimi());
            }else{
                System.out.print("Ioonid: ");
            for(int i = 0; i < molekul.length; i++){
                System.out.print(molekul[i] + " ");
        }
*/

//print aine ja error kui pole

            System.out.println("");
            if(Aine.getNimi() != null){
                System.out.println("Sinu loodud aine: " + Aine.getNimi());
            }else{
                System.out.println("Sellist ainet pole olemas");
            }
            line = reader.readLine();
        }

    }

//getnimi ja tagasta temp
    public static int kntroll(String input, List<Ioon> Ioonid){
        int temp = 0;
        for(Ioon ioon : Ioonid){
            if(input.equals(ioon.getNimi())){
                temp +=1;
            }
        }

        return temp;
    }
}


