public class DisplayNameDefault {
    public static void main(String[] args) {
        // Clinical check: If no name provided, use "World"
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello " + name);
    }
}