import java.util.Scanner;
import java.lang.Math;
public class Main {

    //TASK 1
    public static void divideDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        divideDigits(n / 10);
        System.out.println(n % 10);
    }
    public static void task1(Scanner sc) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        divideDigits(num);
    }

    //TASK 2
    public static int sum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sum(arr, i + 1);
    }
    public static void task2(Scanner sc) {
        System.out.println("Enter the amount of numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = sum(arr, 0);
        System.out.println((double) s / n);
    }

    //TASK 3
    public static boolean primeNumber(int n, int i) {
        if (i > Math.sqrt(n)) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        return primeNumber(n, i + 1);
    }
    public static void task3(Scanner sc) {
        System.out.println("Emter number: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Composite");
            return;
        }
        if (primeNumber(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    //TASK 4
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n -1);
    }
    public static void task4(Scanner sc) {
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    //TASK 5
    public static int fibonacci(int n) {
    if (n == 0) {
        return 0;
    }
    if (n == 1) {
        return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void task5(Scanner sc) {
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }

    //TASK 6
    public static int power(int n, int a) {
        if (a == 0) {
            return 1;
        }
        return n * power(n, a - 1);
    }
    public static void task6(Scanner sc) {
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("Emter power of number: ");
        int a = sc.nextInt();
        System.out.println(power(n, a));

    }

    //TASK 7
    public static void reverse(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        reverse(arr, i + 1);
        System.out.println(arr[i] + " ");
    }
    public static void task7(Scanner sc) {
        System.out.println("Enter the amount of numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0);
    }

    //TASK 8
    public static boolean onlyDig(String s, int i) {
        if (i == s.length()) {
            return true;
        }
        if (s.charAt(i) < '0' || s.charAt(i) > '9') {
            return false;
        }
        return onlyDig(s, i + 1);
    }
    public static void task8(Scanner sc) {
        System.out.println("Enter string: ");
        String s = sc.next();
        if (onlyDig(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //TASK 9
    public static int count(String s, int i) {
        if (i == s.length()) {
            return 0;
        }
        return 1 + count(s, i + 1);
    }
    static public void task9(Scanner sc) {
        System.out.println("Enter string: ");
        String s = sc.next();
        System.out.println(count(s, 0));
    }

    // TASK 10
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void task10(Scanner sc) {
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }

    //SOUT

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main.task1(sc);
        Main.task2(sc);
        Main.task3(sc);
        Main.task4(sc);
        Main.task5(sc);
        Main.task6(sc);
        Main.task7(sc);
        Main.task8(sc);
        Main.task9(sc);
        Main.task10(sc);
    }
}
