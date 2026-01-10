@SuppressWarnings(value = "unused")
/**
 * Describing circles
 * <p>Attributes:
 * <ul>
 *     <li>radius of the circle</li>
 *     <li>color of the surface of the circle</li>
 * </ul>
 */
public class Circle {
    static double PI = 3.141592;

    double radius;
    int color;

    /**
     * Default constructor for circle
     * <p>
     * Set radius to zero and color to white
     */
    Circle() {
        this.radius = 0.0;
        this.color = 0x000000;
    }

    /**
     * Constructs a circle with given radius and color
     *
     * @param radius radius of the new circle
     * @param color  color of the new circle
     */
    public Circle(double radius, int color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Getter for color of a circle
     *
     * @return color of the circle
     */
    int getColor() {
        return this.color;
    }

    /**
     * Setter for color of a circle
     *
     * @param c new color for the existing circle
     */
    void setColor(int c) {
        this.color = c;
    }

    /**
     * Getter for radius of a circle
     *
     * @return radius of the circle
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Setter for radius of a circle
     *
     * @param radius new radius for the existing circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of a circle.
     *
     * @return area of the circle
     */
    public double calculateArea() {

        return Circle.PI * this.radius * this.radius;
    }

    /**
     * Calculates circumference of a circle
     *
     * @return circumference of a circle
     */
    public double calculateCircumference() {
        return 2.0 * Circle.PI * this.radius;
    }

    /**
     * Demo program for class Circle
     * @param args arguments list
     */
    public static void main(String[] args) {
        Circle Left, Right, Middle;

        Left = new Circle(); // default constructor
        Left.radius = 0.5;
        Left.setColor(0xFF0000);

        Middle = new Circle(5.0, 0xFF0000);
        Right = new Circle(10.0, 0x0000FF);

        int colorInTheMiddle = Middle.getColor();
        double areaRight = Right.calculateArea();
        double circumferenceLeft = Left.calculateCircumference();

        System.out.println("The color of the circle in the middle is " + colorInTheMiddle);
        System.out.println("The area of the right circle is " + areaRight);
        System.out.println("The circumference of the circle on the left is " + circumferenceLeft);
    }
}