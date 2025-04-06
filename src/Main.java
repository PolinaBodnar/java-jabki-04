public class Main {

    // 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и возвращает сумму всех чисел между ними (включительно).
    public static int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    // 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
        }
        return max;
    }

    // 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое
    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    // 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
}
