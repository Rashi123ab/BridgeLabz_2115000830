class FibonacciComparison{
    static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args) {
        int[] testCases = {11, 20,45};
        for (int n : testCases) {
            long start, end;
            if (n <= 30) {
                start = System.currentTimeMillis();
                fibonacciRecursive(n);
                end = System.currentTimeMillis();
                System.out.println("Recursive Fibonacci (size=" + n + "): " + (end - start) + "ms");
            }
            start = System.currentTimeMillis();
            fibonacciIterative(n);
            end = System.currentTimeMillis();
            System.out.println("Iterative Fibonacci (size=" + n + "): " + (end - start) + "ms");
        }
    }
}
