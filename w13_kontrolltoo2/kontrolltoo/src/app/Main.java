package app;
import java.util.*;

public class Main {
    public static void main(String[] array){
        Joon joon = new Joon();
        System.out.println(joon.getY(3));

        List<Double> X1 = new ArrayList<>();
        List<Double> Y1 = new ArrayList<>();
        X1.add(2.0);
        Y1.add(3.0);

        System.out.println(joon.getY2(X1, Y1));

       
    
        
    }

}