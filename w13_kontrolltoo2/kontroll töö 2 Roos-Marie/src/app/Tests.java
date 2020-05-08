package app;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
//import java.util

import static org.junit.Assert.*;

public class Tests {


    @Test
    public void test1(){
        Ioon Nitraat = new Ioon("NO3", -1, 62);
        assertEquals(-1, Nitraat.getOsalaeng());
        Ioon VesinikPlus = new Ioon("H", 1, 1);
        assertEquals(1, VesinikPlus.getAineMass());
        
    }



    @Test
    public void test2(){
        //ioon Naatrium
        Ioon VesinikPlus = new Ioon("H", 1, 1);
        assertEquals(1, VesinikPlus.getAineMass());
    }
    


    @Test
    @SuppressWarnings("Double")
    public void test3(){

        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Kloriid = new Ioon("Cl", -1, 35);

        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Naatrium);
        Ioonid.add(Kloriid);

        //Ioonid.add(Naatrium); (Na + cl )
        //Ioonid.add(Kloriid);

        Aine NaCl = new Aine(Ioonid);



        assertEquals("NaCl", NaCl.getNimi());
    }



    @Test
    @SuppressWarnings("Double")
    public void test4(){
        int temp = 0;
        Ioon Naatrium = new Ioon("Na", 1, 23);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        temp = Naatrium.getAineMass() + Kloriid.getAineMass();
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Naatrium);
        Ioonid.add(Kloriid);
        Aine NaCl = new Aine(Ioonid);

        assertEquals(temp, NaCl.getMolekulaarMass());
    }

    /*
    @Test
    public void test5(){
        Ioon Hapnik = new Ioon("O", -2, 16);
        Ioon Lämmastik = new Ioon("N", -3, 14);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Hapnik);
        Ioonid.add(Lämmastik);
        AineSec CO2 = new AineSec(Ioonid);

        assertEquals("CO2", CO2.getNimi());
        assertEquals("CO2", CO2.getNimi());
    }

    */

    

    @Test
    public void test6(){
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Hapnik = new Ioon("O", -2, 16);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Kaltsium);
        Ioonid.add(Hapnik);
        AineSec CaO = new AineSec(Ioonid);

        assertEquals("CaO", CaO.getNimi());
    }



    /*
    @Test
    @SuppressWarnings("Double")
    public void test7(){
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Kaltsium);
        Ioonid.add(Kloriid);
        AineSec CaCl2 = new AineSec(Ioonid);

        assertEquals("CaCl2", CaCl2.getNimi());
    }
    */

    @Test
    public void test7(){
        Ioon Kaltsium = new Ioon("Ca", +2, 40);
        Ioon Kloriid = new Ioon("Cl", -1, 35);
        List<Ioon> Ioonid = new ArrayList<>();
        Ioonid.add(Kaltsium);
        Ioonid.add(Kloriid);
        Ioonid.add(Kloriid);

        AineSec CaCl2 = new AineSec(Ioonid);

        assertEquals("CaCl2", CaCl2.getNimi());
    }
}
