import java.util.Random;
class SortingConcatComparison{
    static void usingString(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
    }
    static void usingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
    static void usingStringBuffer(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int n : sizes) {
            long start, end;
            if (n <= 10000) {
                start = System.currentTimeMillis();
                usingString(n);
                end = System.currentTimeMillis();
                System.out.println("String (Size=" + n + "): " + (end - start) + "ms");
            }
            start = System.currentTimeMillis();
            usingStringBuilder(n);
            end = System.currentTimeMillis();
            System.out.println("StringBuilder (Size=" + n + "): " + (end - start) + "ms");
            start = System.currentTimeMillis();
            usingStringBuffer(n);
            end = System.currentTimeMillis();
            System.out.println("StringBuffer (Size=" + n + "): " + (end - start) + "ms");
        }
    }
}
