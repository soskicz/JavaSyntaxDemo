public class demoString {
    static void main()
    {
        // String
        String justString;
        justString = "Just a string";
        System.out.println(justString);
        System.out.println(justString.charAt(1));

        String withQuotes = "\"String example\"";
        System.out.println(withQuotes);

        System.out.println(withQuotes.length());

        String aString = justString.substring(5);
        System.out.println(aString);
        String noQuotes = withQuotes.substring(1, withQuotes.length()-1);
        System.out.println(noQuotes);

        System.out.println(noQuotes.equals("string example"));
        System.out.println(noQuotes.equalsIgnoreCase("string example"));
        System.out.println(noQuotes.toLowerCase());
        System.out.println(noQuotes.toUpperCase());

        String n = noQuotes.replace('i', 'o');
        System.out.println(n);

        String[] part = justString.split(" ");
        System.out.println(part.length);
        System.out.println(part[0]);
        System.out.println(part[part.length-1]);
    }
}
