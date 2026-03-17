public class HelloApp {
    public static void main(String[] args) {

        // Assign name or default
        String name = (args.length > 0) ? args[0] : "World";

        // Print output
        System.out.println("Hello, " + name + "!");
    }
}