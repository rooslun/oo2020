package app.app;

public class App1 {
    public static void main(String[] args) throws Exception {
        Shape shape1 = new Rhombus(10, 10);
        Shape shape2 = new Rhombus(4, 7);
        Shape shape3 = new Trapezoid(5, 10, 3, 7);
        Shape shape4 = new Trapezoid(8, 2, 6, 9);

        System.out.println("Rombi ümbermõõt on " + shape1.getCircum());
        System.out.println("Rombi ümbermõõt on " + shape2.getCircum());
        System.out.println("Trapetsi ümbermõõt on " + shape3.getCircum()); 
        System.out.println("Trapetsi ümbermõõt on " + shape4.getCircum());
    }

}