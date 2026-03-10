public class demoArguments {
    static void growUp(int x) {
        x++;
    }

    static void turnRed(Circle c) {
        c.setColor(0xFF0000);
    }

    public static void main(String[] args) {
        // passing a primitive
        int a = 0;
        System.out.println(a);
        growUp(a);
        System.out.println(a);

        // passing a reference variable
        Circle testCircle = new Circle(1.0, 0x0000FF); // start blue
        System.out.println(testCircle.getColor());
        turnRed(testCircle);
        System.out.println(testCircle.getColor());
    }
}