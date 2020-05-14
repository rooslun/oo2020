public class Fruit{
    Info fruit;
    int finalAmount;

    public Fruit(Info updated_fruit){
        fruit = updated_fruit;
    }


    public String info(){
        return fruit.kuju + ", " + fruit.color + ", " + fruit.liik + ", " + fruit.taste + ", " + fruit.hind + "€";
    }
}