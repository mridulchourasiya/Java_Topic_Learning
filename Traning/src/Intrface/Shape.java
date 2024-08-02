package Intrface;


public interface Shape {
    void calculateArea();
}

class Circle implements Shape {

    @Override
    public void calculateArea() {
        // Assuming radius is defined somewhere
        int r = 2;
        System.out.println("Area of a Circle is " + (Math.PI * r * r));
    }

    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.calculateArea();
    }
}
