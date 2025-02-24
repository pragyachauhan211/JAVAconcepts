package basicProgram;

import java.util.HashSet;
import java.util.regex.Pattern;

// check if username is valid or invalid with duplicate or blank or special character or upper case or having spaces

class StringDemo8 {

   void compare() {
       String s = "pragya";

       HashSet<String> hset = new HashSet<>();
       hset.add("pragya");
       if (hset.contains(s))
       {
           System.out.println("Duplicate name is entered");
       }
else {
       if (s != null && !s.isEmpty()) {
           if (Pattern.matches("[a-z0-9]+", s)) {
               System.out.println("It is a valid username");
           } else {
               System.out.println("Invalid username is entered");
           }
       } else {
           System.out.println("username is blank");
       }
   }

   }

    public static void main(String[] args)
    {
        StringDemo8 p1 = new StringDemo8();
        p1.compare();
    }
}
