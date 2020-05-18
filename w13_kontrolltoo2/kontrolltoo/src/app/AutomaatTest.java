package app;
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;


public class AutomaatTest {

    // 
    Joon joon1 = new Joon();
    // mitut punkti sirgel Y = 3x
    public Integer Y = joon1.getY(3);

    @Test
// katse 
    public void Start(){
        System.out.println("Testi automaatkäivitus");
    }

    @Test
    public void Test1(){
        // võrdleb, kas joon classist funktsioonile 2 sisse andes returnib see 6
        // peab kolmega korrutama selle
        Joon X = new Joon();
        // 
        // sisseantud arv sobib
        // gety(2) annan joon klassile sisse
        assertEquals(6.0, X.getY(2), 0.1);
    }


    
    
    @Test
    public void Test2(){

        // 

        Joon X = new Joon();
        //loon kaks listi, pushin mõlemasse arvu
        List<Double> X1 = new ArrayList<>();
        List<Double> Y1 = new ArrayList<>();
        X1.add(2.0);
        Y1.add(3.0);
        Double[] Ans = {6.0};

        List<Double> Ans2 = X.getY2(X1, Y1);
        Double[] ds = Ans2.toArray(new Double[Ans2.size()]);  // saab listi ans2, pushidakse arraysse, 

 // expected ja actual
        assertArrayEquals(Ans, ds);
    }

    @Test
    public void Test3(){

        // Y = 3X + 2

        Joon X = new Joon();
        //loon kaks listi, pushin mõlemasse arvu
        List<Double> X1 = new ArrayList<>();
        List<Double> Y1 = new ArrayList<>();
        X1.add(2.0);
        Y1.add(3.0);
        Double[] Ans = {8.0};

        // kutsun Y3, 
        List<Double> Ans2 = X.getY3(X1, Y1);
        Double[] ds = Ans2.toArray(new Double[Ans2.size()]);  // saab listi ans2, pushidakse arraysse, 

 // expected ja actual
        assertArrayEquals(Ans, ds);
    }

}