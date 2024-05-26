public class ShapeArray {
    public static void main(String[] args) {
        // Instantiate one sphere
        Shape sphere = new Sphere(10.0);

        // Instantiate one cylinder
        Shape cylinder = new Cylinder(4.0, 7.0);

        // Instantiate one cone
        Shape cone = new Cone(5.0, 8.0);

        // Store the class instances into an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print out the instance data
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
