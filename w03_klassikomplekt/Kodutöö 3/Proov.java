public class Proov{
    public static void main(String[] args){

        Info crops = new Info("Õun", "Kiivi", "Pirn", "Banaan", 1, 36);
        Fruit vili = new Fruit(crops);

        System.out.println("Praegune puuviljade kogus: " + crops.getAmount());
       
        System.out.println("Puuviljad: " + vili.info());
        

    }
}