public class DisplayName {
    public static void main(String[] args) {
        // Validation: Ensure the hunter provided an input
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Error: Provide a name argument.");
        }
    }
}