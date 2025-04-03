public class Main {
    public static void main(String[] args) {
        printHello("Hello");
        String name = "Котик";
        System.out.println(name);

        System.out.printf("%s * %s = %s%s", 2, 3, 2 * 3, System.lineSeparator());

        int factorial = factorial(3);
        System.out.println(factorial);
    }

    public static void printHello(String hello) {
        System.out.println("Hello");
    }

    public static String hello(String name) {
        return "Hello " + name;
    }

    public static int  multiply(int a, int b) {
        return a * b;
    }

    public static double  multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static int factorial(int n){
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
