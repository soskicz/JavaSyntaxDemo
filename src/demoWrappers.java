public class demoWrappers {
    static void main()
    {
        Integer a = Integer.valueOf(10);  // preferred
        Integer b = new Integer (10); // deprecated
        Integer c = 10;
        int z = c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);

        Integer i = 127;
        Double e = 2.17828;
        String strInt = Integer.toString(i);
        String strDouble = Double.toString(e);
        System.out.println(strInt);
        System.out.println(strDouble);

        String s;
        s = "12";
        int x = Integer.parseInt(s);
        System.out.println(x);

        s = "12.21";
        double y = Double.parseDouble(s);
        System.out.println(y);
    }
}