package app.app;

public class Trapezoid extends Shape {
    double a;
    double b;
    double c;
    double d;

    public Trapezoid(int a, int b, int c, int d){
        this.a = a;
        this.b = b; 
        this.c = b;
        this.d = d;
    }

    @Override
    public double getCircum() {
        
        return a+b+c+d;
    }
}