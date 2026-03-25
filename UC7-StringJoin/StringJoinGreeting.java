public class StringJoinGreeting {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Efficiency: join all arguments with a comma and space
            String names = String.join(", ", args);
            System.out.println("Hello, " + names + "!");
        }
    }
}