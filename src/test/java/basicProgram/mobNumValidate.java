package basicProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mobNumValidate {

    // validate if number starts with 5 digit and should be of upto 10 digits only

    public static boolean isValid(String num)
    {
        // to validate if number starts with 5 and has exactly 9 digits
        String s = "^5\\d{9}$";

        // compile the s string
        Pattern pattern = Pattern.compile(s);

        // create a matcher object
        Matcher matcher = pattern.matcher(num);

        // return whether the mobile number matches the patters
        return  matcher.matches();

    }

    public static void main(String[] args)
    {
        if(isValid("51234678"))
            System.out.println("Valid number");
        else
            System.out.println("Invalid number");
    }
}
