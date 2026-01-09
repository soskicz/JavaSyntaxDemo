import java.io.Console;
import java.util.Scanner;

public class demoIO {
    public static void main(String[] args) {
        // demoSystemOut();
        // demoSystemIn();
        // demoReadLn();
        demoConsole();
    }

    static void demoSystemOut() {
//        String name = "Novak";
//        String surname = "Đoković";
//
//        System.out.println(name);
//        System.out.println(surname);
//
//        System.out.println(name);
//        System.out.println(surname);
//
//        System.out.println(name + " " + surname);

        String message = "Hello World!";
        int x = 203;
        double y = 203;

        System.out.printf("%s",message);
        System.out.printf("%d\n",x);
        System.out.printf("%f\n",y);
        System.out.printf("%d %f\n",x,y);

        System.out.printf("%20s",message);
        System.out.printf("%10d %10.2f",x,y);
    }

    static void demoSystemIn() {
        Scanner input = new Scanner(System.in);

        int x;
        System.out.print("Enter an integer: ");
        boolean inputOK = input.hasNext();
        System.out.println(inputOK);
        boolean nextIntegerReady = input.hasNextInt();
        System.out.println(nextIntegerReady);
        x = input.nextInt();
        System.out.println(x);

        double y;
        System.out.print("Enter a double: ");
        boolean nextDoubleReady = input.hasNextDouble();
        System.out.println(nextDoubleReady);
        y = input.nextDouble();
        System.out.println(y);

        String line;
        System.out.print("Enter a line: ");
        boolean nextLineReady = input.hasNextLine();
        System.out.println(nextLineReady);
        line = input.nextLine();
        System.out.println(line);
        line = input.nextLine();
        System.out.println(line);
    }

    static void demoReadLn() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = Integer.parseInt(input.nextLine());

        System.out.print("Enter a double: ");
        double d  = Double.parseDouble(input.nextLine());

        System.out.print("Enter a line: ");
        String line = input.nextLine();
        System.out.println(line);
    }

    static void demoConsole() {
        Console console = System.console();

        int x = Integer.parseInt(console.readLine("Enter an integer: "));
        double d = Double.parseDouble(console.readLine("Enter a double: "));
        String line = console.readLine("Enter a line: ");
        System.out.println(line);
    }
}