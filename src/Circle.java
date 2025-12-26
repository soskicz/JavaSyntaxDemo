class Circle {
    double radius;
    int color;

    int getColor() {
        return this.color;
    }

    int setColor(int color) {
        this.color = color;
        return color;
    }

    void setColorVoid(int c) {
        this.color = c;
    }

    public static void main(String[] args) {
        Circle Left, Right, Middle;

        Left = new Circle();
        Right = new Circle();
        Middle = new Circle();

        Left = Right = Middle = new Circle();

        Left.radius = 0.5;
        Middle.radius = 1.0;
        Right.radius = 0.5;
    }
}