public class Cone extends Shape {
    private double radius;
    private double height;

    // Parameterized constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return "Cone:\n" +
               "Radius: " + radius + "\n" +
               "Height: " + height + "\n" +
               "Surface Area: " + surfaceArea() + "\n" +
               "Volume: " + volume() + "\n";
    }
}
