package app;
import java.util.*;


public class AineSec implements LiidesAine{
    private String nimi;
    private int molekulaarMass;

    public AineSec(List<Ioon> Ioonid){
        int kntroll = kntrollOsalaengud(Ioonid);
        //kui kontroll 1 gen nimi + arvuta mass
        if(kntroll == 1){
            this.nimi = generateNimi(Ioonid);
            this.molekulaarMass = arvutaMass(Ioonid);
        }else{
            this.nimi = null;
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
    public int kntrollOsalaengud(List<Ioon> Ioonid) {
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
    public int arvutaMass(List<Ioon> Ioonid) {
        int mass = 0;
        for(Ioon ioon : Ioonid){
            mass += ioon.getAineMass();
        }

        return mass;
    }



    @Override
    @SuppressWarnings("Double")
    public String generateNimi(List<Ioon> Ioonid) {
        List<String> positives = new ArrayList<String>();
        List<String> negatives = new ArrayList<String>();

        String pos = ""; //
        // if(ioon.getOsalaeng() >0) {
        String neg = "";
        String GenReadyNimi = "";
        for(Ioon ioon : Ioonid){
            if(ioon.getOsalaeng() >= 0){
                positives.add(ioon.getNimi());
            }else{
                negatives.add(ioon.getNimi());
            }
        }

        Set<String> uniqueP = new HashSet<String>(positives);
        for (String key : uniqueP) {
            //System.out.println(key + ": " + Collections.frequency(positives, key));
            if(Collections.frequency(positives, key) > 1){
                pos += key + Collections.frequency(positives, key);
            }else{
                pos += key;
            }
        }

        Set<String> uniqueN = new HashSet<String>(negatives);
        for (String key : uniqueN) {
            //System.out.println(key + ": " + Collections.frequency(negatives, key));
            if(Collections.frequency(negatives, key) > 1){
                pos += key + Collections.frequency(negatives, key);
            }else{
                pos += key;
            }
        }

        GenReadyNimi += pos;
        GenReadyNimi += neg;
        return GenReadyNimi;
    }
}
