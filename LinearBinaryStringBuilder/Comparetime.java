public class Comparetime{
    public static void main(String[] args) {
        int iterate = 1000000;
        long startTime, endTime;
        StringBuffer sb= new StringBuffer();
        startTime = System.nanoTime();//calculating time of stringbuffer
        for (int i=0;i<iterate; i++) {
            sb.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) + " ns");
        StringBuilder SB= new StringBuilder();
        startTime = System.nanoTime();//calculating time of stringbuilder
        for (int i=0;i<iterate;i++) {
            SB.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) + " ns");
    }
}
