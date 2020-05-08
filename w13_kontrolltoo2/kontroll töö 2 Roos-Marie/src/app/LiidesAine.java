package app;
import java.util.List;

public interface LiidesAine {
    public String getNimi();
    public String generateNimi(List<Ioon> Ioonid);
    public int kntrollOsalaengud(List<Ioon> Ioonid);
    public int getMolekulaarMass();
    public int arvutaMass(List<Ioon> Ioonid);
    
}
