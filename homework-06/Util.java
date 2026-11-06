// Tasks 9 and 10 are absent from the teacher's source document.

    /** Exercise 11: Prints the integers from 1 to 200. */
    public static void print1To200() {
        for (int i = 1; i <= 200; i++) {
            System.out.println(i);
        }
    }

    /**
     * Exercise 12: Prints the first (leftmost) digit of an integer.
     * @param number the number
     */
    public static void printFirstDigit(int number) {
        long value = Math.abs((long) number);
        while (value >= 10) value /= 10;
        System.out.println(value);
    }

    /**
     * Exercise 13: Prints x+y while x<5 and y<10, with x initially 1 and y 0.
     * x and y are incremented to ensure the loop eventually terminates.
     */
    public static void printSumsWhile() {
        int x = 1;
        int y = 0;
        while (x < 5 && y < 10) {
            System.out.println(x + y);
            x++;
            y++;
        }
    }

    /**
     * Exercise 14: Prints a square made of '*' symbols.
     * @param size positive side length
     */
    public static void printSquare(int size) {
        if (size <= 0) throw new IllegalArgumentException("Size must be positive");
        for (int row = 0; row < size; row++) {
            String line = "";
            for (int col = 0; col < size; col++) line += "*";
            System.out.println(line);
        }
    }

    /**
     * Exercise 15: Reads N from the console and prints the sum of multiples of 5 in [1,N].
     */
    public static void sumMultiplesOf5FromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = scanner.nextInt();
        long sum = 0;
        for (int i = 5; i <= n; i += 5) sum += i;
        System.out.println("Sum = " + sum);
        // Do not close the Scanner: it would close System.in.
    }

    /**
     * Exercise 16: Computes the product of two-digit even numbers in [1,N].
     * BigInteger is used to prevent integer overflow.
     * @param n the upper bound
     * @return product, or 1 when the range contains no such numbers
     */
    public static BigInteger productOfTwoDigitEvens(int n) {
        BigInteger product = BigInteger.ONE;
        for (int i = 10; i <= n && i <= 98; i += 2) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }

    /**
     * Exercise 17: Finds min and max among integers 1..N, then their arithmetic mean.
     * @param n the positive upper bound
     * @return arithmetic mean of the minimum and maximum
     */
    public static double meanOfMinAndMax(int n) {
        if (n < 1) throw new IllegalArgumentException("N must be positive");
        int min = 1;
        int max = n;
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        return ((long) min + max) / 2.0;
    }

    /**
     * Exercise 18: Finds the sum of the digits of a five-digit integer.
     * @param number a five-digit integer
     * @return sum of its digits
     */
    public static int sumOfFiveDigits(int number) {
        long abs = Math.abs((long) number);
        if (abs < 10000 || abs > 99999) {
            throw new IllegalArgumentException("Input must have five digits");
        }
        int sum = 0;
        while (abs > 0) {
            sum += abs % 10;
            abs /= 10;
        }
        return sum;
    }

    /**
     * Demonstrates the exercises with example values.
     * For exercise 15, run sumMultiplesOf5FromConsole() separately when input is available.
     * @param args unused command-line arguments
     */
    public static void main(String[] args) {
        System.out.println("1: " + isEven(12));
        System.out.println("2: " + numberSign(-5));
        System.out.println("3: " + isInRanges(6));
        System.out.println("4: " + divisibleBy5And7(70));
        System.out.println("5: " + isMiddleDigitSeven(974));
        System.out.println("6 (radius=3): " + isInsideCircle(0, 7, 3));
        System.out.println("7: " + maxOfThree(4, 12, 8));
        System.out.println("8: " + isLeapYear(2024));
        System.out.println("11: printing 1..200:");
        print1To200();
        System.out.println("12: first digit of 12345:");
        printFirstDigit(12345);
        System.out.println("13: while sums:");
        printSumsWhile();
        System.out.println("14: 4x4 square:");
        printSquare(4);
        System.out.println("15: run sumMultiplesOf5FromConsole() for console input");
