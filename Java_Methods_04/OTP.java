import java.util.*;
public class OTP{
	public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; 
    }
//check if all OTPs in the array are unique
    public static boolean CheckUniqueOTP(int[] otpArray) {
        HashSet<Integer> uniqueOTPs = new HashSet<>();
        for (int otp : otpArray) {
            if (!uniqueOTPs.add(otp)) {
                return false;  //duplicate OTP
            }
        }
        return true;  //unique OTP
    }
	public static void main(String[] args) {
        int[] otpArray = new int[10];
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
        }
        System.out.println("Generated OTPs:");
        for (int otp : otpArray) {
            System.out.println(otp);
        }
        boolean unique = CheckUniqueOTP(otpArray);
        System.out.println("Are all OTPs unique? " + unique);
    }
}
