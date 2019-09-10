package my_pack;

import java.util.Scanner;

class Validate{
    public static int validateString(String s){
        //take the ascii values in range 97 to 122 which is for a-z. If any on eof the value is not present, return False.
        for(int i=97;i<=122;i++){
            if(s.indexOf((char)i)==-1){
                return 0;
            }

        }
        return 1;
    }
        }

public class JavaAss2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String var = sc.nextLine();
        if(Validate.validateString(var)==0){
            System.out.println("a-z is not present\n");

        }
        else{
            System.out.println("a-z is present\n");
        }
    }

}
//The time complexity of the following code is O(26*n) which is equivalent to O(n). n is thee length of the input string.
