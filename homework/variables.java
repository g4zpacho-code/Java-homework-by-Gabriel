
/**
 * Homework 4 - Primitive Data Types.
 * All exercises are implemented in this single class.
 * Java 8 compatible.
 */
public class Variables {

    /** Exercise 1: Creates and prints two byte variables. */
    public static void exercise1() {
        byte a = 10;
        byte b = 20;
        System.out.println(a);
        System.out.println(b);
    }

    /** Exercise 2: Creates and prints two short variables. */
    public static void exercise2() {
        short c = 1000;
        short d = 2000;
        System.out.println(c);
        System.out.println(d);
    }

    /** Exercise 3: Creates and prints two int variables. */
    public static void exercise3() {
        int e = 100000;
        int f = 200000;
        System.out.println(e);
        System.out.println(f);
    }

    /** Exercise 4: Creates and prints two long variables. */
    public static void exercise4() {
        long g = 10000000000L;
        long h = 20000000000L;
        System.out.println(g);
        System.out.println(h);
    }

    /** Exercise 5: Prints the minimum and maximum integer primitive values. */
    public static void exercise5() {
        System.out.println("Byte MIN: " + Byte.MIN_VALUE);
        System.out.println("Byte MAX: " + Byte.MAX_VALUE);
        System.out.println("Short MIN: " + Short.MIN_VALUE);
        System.out.println("Short MAX: " + Short.MAX_VALUE);
        System.out.println("Int MIN: " + Integer.MIN_VALUE);
        System.out.println("Int MAX: " + Integer.MAX_VALUE);
        System.out.println("Long MIN: " + Long.MIN_VALUE);
        System.out.println("Long MAX: " + Long.MAX_VALUE);
    }

    /** Exercise 6: Creates byte and int variables using binary literals. */
    public static void exercise6() {
        byte a = 0b1010;
        int b = 0b1100100;
        System.out.println(a);
        System.out.println(b);
    }

    /** Exercise 7 (floating-point task 6): Prints two float variables. */
    public static void exercise7() {
        float j = 12.5f;
        float k = 45.75f;
        System.out.println(j);
        System.out.println(k);
    }

    /** Exercise 8 (original task 7): Prints two double variables. */
    public static void exercise8() {
        double l = 123.456;
        double m = 789.123;
        System.out.println(l);
        System.out.println(m);
    }

    /**
     * Exercise 9 (original task 8): Prints float/double limits.
     * MIN_VALUE means the smallest positive nonzero value, not the most negative.
     */
    public static void exercise9() {
        System.out.println("Float MIN_VALUE (positive): " + Float.MIN_VALUE);
        System.out.println("Float MAX_VALUE: " + Float.MAX_VALUE);
        System.out.println("Float lowest finite: " + (-Float.MAX_VALUE));
        System.out.println("Double MIN_VALUE (positive): " + Double.MIN_VALUE);
        System.out.println("Double MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double lowest finite: " + (-Double.MAX_VALUE));
    }

    /**
     * Exercise 10 (original task 9): Shows assignments to float and double.
     * Decimal literals are double by default; the f suffix creates float literals.
     */
    public static void exercise10() {
        double d1 = 34.567839023;
        double d2 = 12.345;
        double d3 = 8923.1234857;
        double d4 = 3456.091;

        float f1 = 34.567839023f;
        float f2 = 12.345f;
        float f3 = 8923.1234857f;
        float f4 = 3456.091f;

        System.out.println("Double values: " + d1 + ", " + d2 + ", " + d3 + ", " + d4);
        System.out.println("Float values: " + f1 + ", " + f2 + ", " + f3 + ", " + f4);
    }

    /** Exercise 11 (original task 10): Creates and prints two char values. */
    public static void exercise11() {
        char n = 'A';
        char o = 'B';
        System.out.println(n);
        System.out.println(o);
    }

    /** Exercise 12 (original task 11.1): Prints chars with codes 77 and 109. */
    public static void exercise12() {
        char s = 77;
        char w = 109;
        System.out.println(s);
        System.out.println(w);
    }

    /** Exercise 13 (original task 11.2): Prints 'K' using common char notations. */
    public static void exercise13() {
        char kLiteral = 'K';
        char kDecimal = 75;
        char kUnicode = '\u004B';
        char kHexadecimal = 0x004B;
        char kOctal = '\113';

        System.out.println(kLiteral);
        System.out.println(kDecimal);
        System.out.println(kUnicode);
        System.out.println(kHexadecimal);
        System.out.println(kOctal);
    }

    /** Exercise 14 (original task 12): Creates and prints two booleans. */
    public static void exercise14() {
        boolean p = true;
        boolean q = false;
        System.out.println(p);
        System.out.println(q);
    }

    /**
     * Exercise 15 (original task 13): Explains the compilation error.
     * Original 'int year = 201l;' does not compile because 201l is a long literal.
     */
    public static void exercise15() {
        System.out.println("Original code 'int year = 201l;' does not compile.");
        int year = 201;
        System.out.println("Corrected value: " + year);
    }

    /** Exercise 16 (original task 14): Automatically widens int to long. */
    public static void exercise16() {
        int aa = 7;
        long bb = aa;
        System.out.println(bb);
    }

    /** Exercise 17 (original task 15): Automatically widens int to double. */
    public static void exercise17() {
        int myInt = 7;
        double myDouble = myInt;
        System.out.println(myDouble);
    }

    /** Exercise 18 (original task 16): Explicitly narrows double to int. */
    public static void exercise18() {
        double dd = 9.78d;
        int ii = (int) dd;
        System.out.println(ii);
    }

    /** Exercise 19 (original task 17): Explicitly narrows int to byte. */
    public static void exercise19() {
        int ff = 9999;
        byte gg = (byte) ff;
        System.out.println(gg);
    }

    /** Exercise 20 (original task 18): Fixes and prints six invalid declarations. */
    public static void exercise20() {
        // Original: long max = 3123456789;
        long max = 3123456789L;
        System.out.println("max = " + max);

        // Original: double d = 1000_.00;
        double d = 1_000.00;
        System.out.println("d = " + d);

        // Original: char i = 'i'; char j = 'j'; char ij = i + j;
        char i = 'i';
        char j = 'j';
        char ij = (char) (i + j);
        System.out.println("ij Unicode code = " + (int) ij);
        System.out.println("i and j as text = " + i + j);

        // Original: int 7a = 8;
        int a7 = 8;
        System.out.println("a7 = " + a7);

        // Original: long h = h + 8;
        long h = 0L;
        h = h + 8;
        System.out.println("h = " + h);

        // Original: int n, m = 11; m = n;
        int n = 0, m = 11;
        m = n;
        System.out.println("m = " + m);
    }

    /**
     * Runs every exercise in the order of the homework document.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("--- Exercise 1: byte ---");
        exercise1();
        System.out.println("--- Exercise 2: short ---");
        exercise2();
        System.out.println("--- Exercise 3: int ---");
        exercise3();
        System.out.println("--- Exercise 4: long ---");
        exercise4();
        System.out.println("--- Exercise 5: Integer limits ---");
        exercise5();
        System.out.println("--- Exercise 6: Binary numbers ---");
        exercise6();
        System.out.println("--- Exercise 7: float ---");
        exercise7();
        System.out.println("--- Exercise 8: double ---");
        exercise8();
        System.out.println("--- Exercise 9: Floating-point limits ---");
        exercise9();
        System.out.println("--- Exercise 10: float vs double ---");
        exercise10();
        System.out.println("--- Exercise 11: char ---");
        exercise11();
        System.out.println("--- Exercise 12: Unicode codes ---");
        exercise12();
        System.out.println("--- Exercise 13: Ways to print K ---");
        exercise13();
        System.out.println("--- Exercise 14: boolean ---");
        exercise14();
        System.out.println("--- Exercise 15: Compilation error ---");
        exercise15();
        System.out.println("--- Exercise 16: int to long ---");
        exercise16();
        System.out.println("--- Exercise 17: int to double ---");
        exercise17();
        System.out.println("--- Exercise 18: double to int ---");
        exercise18();
        System.out.println("--- Exercise 19: int to byte ---");
        exercise19();
        System.out.println("--- Exercise 20: Fix errors ---");
        exercise20();
    }
}
