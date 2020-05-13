package app.app;

public class Rhombus extends Shape {
    double a;
    double b;

    public Rhombus(int a, int b){
        this.a = a;
        this.b = b; 
    }

    @Override
    public double getCircum() {
        
        return 2*(a+b);
    }
}