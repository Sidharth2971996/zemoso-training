import java.io.*;
import java.util.HashMap;
import java.util.Map;

class OccurenceOfCharInString {
    static void characterCount(String inputString) throws FileNotFoundException {
        // Creating a HashMap containing char as a key and occurrences as  a value

        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();

        // Converting input string to char array

        char[] strArray = inputString.toCharArray();

        // checking each char of strArray
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {

                // If char is present in charCountMap, increment it's count by 1

                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {

                // If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }

        // Printing the console output to the output.txt file
        PrintStream o = new PrintStream(new File("output.txt"));
        // Assign o to output stream
        System.setOut(o);
        for (Map.Entry entry : charCountMap.entrySet()) {



            System.out.println(entry.getKey() + " " + entry.getValue());
        }






    }
}

public class GetCharacterCount {
    public static void main(String[] args) throws IOException {
        //read the input file
        File file = new File("Article370");

        BufferedReader br = new BufferedReader(new FileReader(file));
        //reading the input file string by string
        String st;
        while ((st = br.readLine()) != null){
            OccurenceOfCharInString.characterCount(st);
        }


    }
}

