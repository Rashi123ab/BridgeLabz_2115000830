public class Concatenate{
    public static String concatenate(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] input = {"Rashi", " ", "Agrawal", "."};
        String output = concatenate(input);
        System.out.println(output);
    }
}

