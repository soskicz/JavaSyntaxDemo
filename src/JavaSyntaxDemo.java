import java.util.Scanner;

public class JavaSyntaxDemo {

    public static void main(String[] args)
    {
        // using Wrappers
        // demoWrap();

        // using strings
        //demoString();

        // using NULL
        // String s = null;

        // using arithmetic operators
        // demoArithmetic();

        // using comparison operators
        // demoCompare();

        // using logical operators
        // demoLogic();

        // using binary logical operators
        // demoBinaryLogic();

        // using assignment operators
        demoAssignment();

        // using incrementation operators
        //demoIncrementation();

        // using incrementation operators
        // demoConcatenation();
    }

    static void demoString()
    {
        // String
        String s;

        System.out.print("Enter the string \"String example\":");
        Scanner scanner = new Scanner(System.in);

        s = scanner.nextLine();

        System.out.println(s.equals("string example"));
        System.out.println(s.equalsIgnoreCase("string example"));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(7));
        System.out.println(s.substring(0, 6));

        String[] part = s.split(" ");
        System.out.println(part[0]);

        String n = s.replace('i', 'o');
        System.out.println(n);
    }

    static void demoWrap()
    {
        String s;

        s = "12";
        int x = Integer.parseInt(s);
        System.out.println(x);

        s = "12.21";
        double y = Double.parseDouble(s);
        System.out.println(y);
    }

    static void demoArithmetic()
    {
        int a = 5, b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        double c = 5.4, d = 2;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c % d);
    }

    static void demoCompare()
    {
        boolean res;

        res = 2 < 3;
        System.out.println("2 < 3 :" + res);
        res = 2 > 3;
        System.out.println("2 > 3 :" + res);
        res = 2 <= 3;
        System.out.println("2 <= 3 :" + res);
        res = 2 >= 3;
        System.out.println("2 >= 3 :" + res);
        res = 2 != 3;
        System.out.println("2 != 3 :" + res);
        res = 2 == 3;
        System.out.println("2 == 3 :" + res);
    }

    static void demoLogic()
    {
        boolean res, a , b;

        a = 2 < 3;
        b = 2 > 3;

        res = !a; // NOT a
        System.out.println(" !(2<3) :" + res);

        res = a && b; // a AND b
        System.out.println(" (2<3) && (2>3) :" + res);

        res = a || b; // a OR b
        System.out.println(" (2<3) || (2>3) :" + res);
    }

    static void demoBinaryLogic()
    {
        byte a , b;
        int res;

        a = 0x05; // 0000 0101
        b = 0x04; // 0000 0100

        res = ~a; // invert bits of a res = 1111 1010 = 0xFA
        System.out.println(" ~(0000 0101) :" + res);

        res = a & b; // a AND b
        System.out.println(" (0000 0101) & (0000 100) :" + res);

        res = a | b; // a OR b
        System.out.println(" (0000 0101) | (0000 100) :" + res);
    }

    static void demoAssignment()
    {
        int x;

        x = 4;
        System.out.println(" x = 4 x: " + x);
        x += 2; // x = x + 2
        System.out.println(" x += 2 x: " + x);
        x -= 2; // x = x - 2
        System.out.println(" x -= 2 x: " + x);
        x *= 2; // x = x * 2
        System.out.println(" x *= 2 x: " + x);
        x /= 2; // x = x / 2
        System.out.println(" x /= 2 x: " + x);
        x %= 2; // x = x % 2
        System.out.println(" x %= 2 x: " + x);
    }

    static void demoIncrementation()
    {
        int x = 10;
        int y = x++; // y = x; x = x + 1;
        int z = ++x; // x = x + 1;  z = x;

        System.out.println("x: " + x + " y: " + y + " z: " + z );

        // demo for logic truncation: calculation of conjunction stops once an operand with false is found
        boolean res = (x < 10) && (x++ > 10); // res = false && who cares?
        // x++ is never executed because the first operand is false and evaluation of expression is truncated
        System.out.println("x: " + x);
    }

    static void demoConcatenation()
    {
        String fname = "Novak", lname = "Djokovic";
        System.out.println(fname + " " + lname);

        int a = 5, b = 2; String s = "x";
        System.out.println(a + b + s); // "7x"
        System.out.println(s + a + b); // "x52"
    }
}
