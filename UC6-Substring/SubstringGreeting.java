public class SubstringGreeting {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Start the builder
            String greeting = "Hello, ";
            
            // Enhanced For-Loop iteration
            for (String name : args) {
                greeting += name + ", ";
            }
            
            // Clinical removal of the trailing ", " (last 2 characters)
            greeting = greeting.substring(0, greeting.length() - 2);
            
            // Finalize with punctuation
            System.out.println(greeting + "!");
        }
    }
}