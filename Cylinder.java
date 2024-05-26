public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Parameterized constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cylinder:\n" +
               "Radius: " + radius + "\n" +
               "Height: " + height + "\n" +
               "Surface Area: " + surfaceArea() + "\n" +
               "Volume: " + volume() + "\n";
    }
}
