//impordin vajalikud packagid


import java.io.BufferedWriter;
// file lugemiseks

import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// throw a failure in Input & Output operations. It is a checked exception.
import java.util.List;
import java.util.ArrayList;
//import array list et saaks ise muuta arratlisti pikkust, sealt eemaldada ja faile lisada



public class OunteJagamine {

    
    public static void main(String[] args) throws IOException {
        //linkin file et programm hakkaks seda lugema
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));


        //nimetan muutuja A, mis on õunade arv korvi
        int A = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        List<Integer> korvid = new ArrayList<>();

        // Kui rida ei ole 0, lisa korv juurde korvide listi
        while(line != null){
            korvid.add(Integer.parseInt(line));
            line = reader.readLine();
        }
        //sulgen lugeja 
        reader.close();

        // Arvutan palju õunu kokku on
        int kokku = 0;
        for(int n = 0; n < A; n++){
            kokku += korvid.get(n);
        }
        // tahan saada pool õunte hulgas, ehk jagan kogu summa kahega
        int pool = kokku / 2;
        int jagaja = 1;
        boolean solved = false;

        // kuna korve ei saa pooleks teha, pean leidma korvide vahelise koha niiet vahe oleks miinimum
        while(solved == false){
            int pool2 = 0;
            for(int n = 0; n < jagaja; n++){
                pool2 += korvid.get(n);
            }

            if(pool2 >= pool){
                if(Math.abs(kokku - 2* pool2) <= Math.abs(kokku - 2* pool2 - 2* korvid.get(jagaja))){
                    solved = true;
                }else{
                    jagaja--;
                    solved = true;
                }
            }else{
                jagaja++;
            }
        }
        
        System.out.println("Parim koht joone tõmbamiseks on " + jagaja + " korvi vahel");
        
        
        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));
        // teen uue file writeri, programm loob ise uue tekstifile
        //  kuhu programm õige  vastuse sisetab
        writer.write(Integer.toString(jagaja));
        writer.close();
    }
}