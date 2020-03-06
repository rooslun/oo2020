// ÜLESANNE 1

import java.io.BufferedReader;
import java.io.FileReader;

public class Index {

    public static void main(String[] args) throws Exception {
        // kasutan wrapperit bufferedreader et lugeda andmeid sisse reakaupa failist
        // A_t2ht

        BufferedReader lugeja = new BufferedReader(new FileReader("A_t2ht.txt"));

        String textFile;
        String[] words = new String[0];
        int alowercase = 0;
        int acapital = 0;

        // splitin sõnad ja teen while loopi mis hakkaks loendama suuri ja väikseid A
        // tähti
        while ((textFile = lugeja.readLine()) != null) {
            words = textFile.split(" ");
            for (int i = 0; i <= textFile.length() - 1; i++) {
                if (textFile.charAt(i) == 'a') {
                    alowercase++;
                } else if (textFile.charAt(i) == 'A') {
                    acapital++;
                }
            }
            // prindin välja eraldi palju on suuri ja väikseid a tähti, siis liidan mõlemad
            // muutujad kokku ja saan palju failis on kokku a tähti
            System.out.println("Failis on " + alowercase + "väikest A tähte");
            System.out.println("Failis on " + acapital + "suurt A tähte");
            System.out.println("______________________________________________");
            // alg väärtustatn muutujad 0ga
            int acount = 0;
            int Ak6ik = (alowercase + acapital);
            int loendur = 1;
            int loendur1 = 2;
            int loendur2 = 3;
            int loendur3 = 4;
            int loendur4 = 5;
            int word = 0;
            int word1 = 0;
            int word2 = 0;
            int word3 = 0;
            int word4 = 0;

            for (int i = 0; i <= words.length - 1; i++) {
                for (int k = 0; k <= words[i].length() - 1; k++) {
                    if (words[i].toLowerCase().charAt(k) == 'a') {
                        acount++;

                    }
                }
                // loendan mitu a tähte igas sõnas on
                if (acount == loendur) {
                    word++;
                } else if (acount == loendur1) {
                    word1++;
                } else if (acount == loendur2) {
                    word2++;
                } else if (acount == loendur3) {
                    word3++;
                } else if (acount == loendur4) {
                    word4++;
                }
                System.out.println("Sõnas " + words[i] + " on a tähti: " + acount);
                acount = 0;

            }

            // prindin kogu saadud info välja
            System.out.println();
            System.out.println("kokku on suuri ja väikseid a tähti: " + Ak6ik);
            System.out.println("______________________________________________");
            System.out.println("Keskmiselt on sõnades " + Ak6ik / words.length + " a täht(e)");
            System.out.println(word + " sõnas on 1 'A' täht.");
            System.out.println(word1 + " sõnas on 2 'A' tähte.");
            System.out.println(word2 + " sõnas on 3 'A' tähte.");
            System.out.println(word3 + " sõnas on 4 'A' tähte.");
            System.out.println(word4 + " sõnas on 5 'A' tähte.");

        }
    }
}
