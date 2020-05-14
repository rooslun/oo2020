public class Info{
    String color;
    String liik;
    String kuju;
    String taste;
    double hind;
    int kogus;

    public Info(String uus_color, String uus_liik, String uus_kuju, String uus_taste, double uus_hind, int uus_kogus){
        color = uus_color;
        liik = uus_liik;
        kuju = uus_kuju;
        taste = uus_taste;
        hind = uus_hind;
        kogus = uus_kogus;
    }
    public int getAmount(){
        return kogus;
    }
}