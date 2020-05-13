public class Car {

    //private String name;
    CarType carType;
    CarColorType carColorType;

    public Car(String name, CarType carType, CarColorType carColorType){
        //this.name = name;
        this.carType = carType;
        this.carColorType = carColorType;
    }

    

    public String getType(){
        if(carType == CarType.SPORT){
            return "Sportauto";
        }else if(carType == CarType.PERE){
            return "Pereauto";
        }else{
            return "Ralliauto";
        }
    }
    
    public String getColor(){
        if(carColorType == CarColorType.GREEN){
            return "Roheline";
        }else if(carColorType == CarColorType.WHITE){
            return "Valge";
        }else if(carColorType == CarColorType.BLACK){
            return "Must";
        }else{
            return "Hall";
        }
    }

    public void action(){
        if(carType == CarType.SPORT){
            System.out.println("Linna sõiduks");
        }else if(carType == CarType.RALLI){
            System.out.println("Ralli sõitmiseks");
        }
    }
}