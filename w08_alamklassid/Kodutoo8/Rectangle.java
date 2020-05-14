public class Rectangle extends Shape {
    double a;
    double b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getCircum() {
        return 2*(a+b);
    }
}