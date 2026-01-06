public class demoArray {
    static void main() {

        int[] evens = {2, 4, 6, 8, 10};
        System.out.println(evens.length);

        int[] numbers;
        numbers = new int[5];
        System.out.println(numbers.length);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println();
        numbers[0] = evens[4];
//        numbers[0] = evens[5]; // This is a typical error of beginners who come from Pascal background
        numbers[1] = evens[3];
        numbers[2] = evens[2];
        numbers[3] = evens[1];
        numbers[4] = evens[0];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        Circle[] innerPlanets = {
                new Circle(0.25, 0xFFFF00),  // Mercury - small and yellow
                new Circle( 0.95, 0xFFFFFF), // Venus - almost as Earth and white
                new Circle( 1.00, 0x0000FF), // Earth - big as Earth and blue
                new Circle( 0.75, 0xFF0000)  // Mars - smaller than Earth and red
        };

        System.out.println();
        System.out.println(innerPlanets[0].calculateArea());
        System.out.println(innerPlanets[1].calculateArea());
        System.out.println(innerPlanets[2].calculateArea());
        System.out.println(innerPlanets[3].calculateArea());

    }
}
