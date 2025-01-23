public class SpringSeason {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please command-line arguments.");
            return;
        }

        // Parsing the month and day
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check,date is in the Spring season
        boolean isSpring = false;

        if (month == 3 && day >= 20 && day <= 31) {
            isSpring = true;
        } else if (month == 4 && day >= 1 && day <= 30) {
            isSpring = true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            isSpring = true;
        }
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }
}
