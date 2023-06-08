package Es01_abstract_class;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Un metodo abstract non ha codice associato
    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        // é obbligatorio nel costruttore di una classe derivata
        // chiamare per prima cosa il costruttore della classe "madre"
        // per questo motivo: super(...)
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
