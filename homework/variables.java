public class Variables {

    /
Exercise 1: Creates and prints
two byte variables.*/
public static void exercise1() {
 byte a = 10;
 byte b = 20;

        System.out.println(a);
        System.out.println(b);
    }

    /
Exercise 2: Creates and prints
two short variables.*/
public static void exercise2() {
 short c = 1000;
 short d = 2000;

        System.out.println(c);
        System.out.println(d);
    }

    /
Exercise 3: Creates and prints
two int variables.*/
public static void exercise3() {
 int e = 100000;
 int f = 200000;

        System.out.println(e);
        System.out.println(f);
    }

/**
     
Exercise 4: Creates and prints
two long variables.*/
public static void exercise4() {
    long g = 10000000000L;
    long h = 20000000000L;

        System.out.println(g);
        System.out.println(h);
    }

    /**
     
Exercise 5: Prints minimum and maximum
values of integer primitive types.*/
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

    /**
Runs all exercises.*
@param args command-line arguments**/
public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }
