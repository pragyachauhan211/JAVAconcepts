package basicProgram;

public class CountRepeatedCharDemo9 {

    // count number of vowels and consonant in a string
    public void panagram()
    {
        String s = "aeiousaeiouaaaaaghrqn";
        int vcount=0;
        int ccount=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='e'||s.charAt(i)=='u')
            {
                vcount++;
            }
            else
            {
                ccount++;
            }
        }

        System.out.println(vcount);
        System.out.println(ccount);

    }



    public static void main(String[] args)
    {
        CountRepeatedCharDemo9 p = new CountRepeatedCharDemo9();
        p.panagram();
    }

}
