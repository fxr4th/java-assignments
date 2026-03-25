public class EnhancedGreeting {
    public static void main(String[] args) {
        // Robustness: Handle zero arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Enhanced For-Loop: Clinical iteration
            for (String name : args) {
                System.out.println("Hello, " + name + "!");
            }
        }
    }
}