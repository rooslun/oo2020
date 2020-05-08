package app;
import java.util.List;

public class Aine implements LiidesAine{
    private String nimi;
    //private int MolekulaarMass
    private int molekulaarMass;



    public Aine(List<Ioon> Ioonid){
        int kntroll = kntrollOsalaengud(Ioonid);
        if(kntroll == 1){
            this.nimi = generateNimi(Ioonid);
            this.molekulaarMass = arvutaMass(Ioonid);
        }else{

            this.nimi = "Sellist ainet pole kahjuks olemas";
            //this.molekulaarmass
            this.molekulaarMass = 0;

        }
    }

    @Override
    public String getNimi() {
        return this.nimi;
    }

    @Override
    public int getMolekulaarMass() {
        return this.molekulaarMass;
    }

    @Override
    public int kntrollOsalaengud(List<Ioon> Ioonid){
        int osalaengud = 0;
        for(Ioon ioon : Ioonid){
            osalaengud += ioon.getOsalaeng();
        }
        if(osalaengud == 0){
            return 1;
        }else{
            return  0;
        }
    }

    @Override
    public int arvutaMass(List<Ioon> Ioonid){
        int mass = 0;

        for(Ioon ioon : Ioonid){
            //mass += ioon.getOsalaeng()
            // if(osalaengud == 0)
            mass += ioon.getAineMass();
        }

        return mass;
    }





    // generate nimi pos ja negative 
    @Override
    public String generateNimi(List<Ioon> Ioonid) {
        String pos = "";
        String neg = "";
        String GenReadyNimi = "";
        for(Ioon ioon : Ioonid){
            if(ioon.getOsalaeng() >= 0){
                pos += ioon.getNimi();
            }else{
                neg += ioon.getNimi();
            }
        }
        GenReadyNimi += pos;
        GenReadyNimi += neg;
        return GenReadyNimi;
    }
}
