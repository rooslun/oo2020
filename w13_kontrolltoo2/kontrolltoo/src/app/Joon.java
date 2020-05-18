package app;
import java.util.*;



public class Joon implements JoonInterface{
    // Joon klass, 


    // get Y funktsioon
    public Integer getY(Integer X) {
        return 3*X; // returnib Y = 3x
    }
// teen listi doublitest, hakkan läbi loopima listi. 
// Lisab need answer massiivi, korrutab
// annab X ja Yki

    public List<Double> getY2(List<Double> X, List<Double> Y) {
        List<Double> answers = new ArrayList<>(); // lisatakse kahe listi korrutis
        for(Integer i = 0; i < X.size(); i++){

            answers.add(X.get(i)*Y.get(i));


        }
        return answers;

    }

    // Y3, Y = 3x + 2
    public List<Double> getY3(List<Double> X, List<Double> Y) {
        List<Double> answers = new ArrayList<>(); // lisatakse kahe listi korrutis
        for(Integer i = 0; i < X.size(); i++){

            answers.add(X.get(i)*Y.get(i) + 2);


        }
        return answers;

    }

}

