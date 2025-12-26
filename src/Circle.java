class Circle {
    static double PI = 3.141592;

    double radius;
    int color;

    Circle() {
        this.radius = 0.0;
        this.color = 0x000000;
    }

    public Circle(double radius, int color) {
        this.radius = radius;
        this.color = color;
    }

    int getColor() {
        return this.color;
    }
    void setColor(int c) {
        this.color = c;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Circle.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        Circle Left, Right, Middle;

        Left = new Circle(); // default constructor
        Left.radius = 0.5;
        Left.setColor(0xFF0000);

        Middle = new Circle(5.0,0xFF0000);
        Right = new Circle(10.0, 0x0000FF);

        int colorInTheMiddle = Middle.getColor();
        double areaRight = Right.calculateArea();

        System.out.println("The color of the circle in the middle is " + colorInTheMiddle);
        System.out.println("The area of the right circle is " + areaRight);
    }
}