public class DisplayMultipleNames {
    public static void main(String[] args) {
        // If no names are provided, use the default "World"
        if (args.length == 0) {
            System.out.println("Hello World");
        } else {
            // Iterate through every name provided in the arguments
            for (String name : args) {
                System.out.println("Hello " + name);
            }
        }
    }
}