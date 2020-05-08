package app;
public class Ioon implements LiidesIoon {
    private String nimi;
    private int osalaeng;
    private int aineMass;
    

    public Ioon(String nimi, int osalaeng, int aine_M){
        this.nimi = nimi;
        this.osalaeng = osalaeng;
        this.aineMass = aine_M;
    }

     @Override
    public String getNimi() {
        return this.nimi;
    }
    

    @Override
    public int getOsalaeng() {
        return this.osalaeng;
    }

    @Override
    public int getAineMass() {
        return this.aineMass;
    }

   
}
