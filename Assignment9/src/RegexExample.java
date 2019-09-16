import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        //scanner object created
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string you want to compare\n");
        String text=s.nextLine();
        //input text is compared to the regex "^[A-Z].*\.$" which means start with any capital letter and end with a dot.

        if (text.matches("^[A-Z].*\\.$"))
        {

            System.out.println("Given string starts with a capital alphabet and ends with a dot");
        }
        else{
            System.out.println("Given string doesn't match the pattern");
        }
    }
}
