import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
class EncryptMessage{
    String message;
    int start;
    int size;
    EncryptMessage(String message,int start,int size){
        this.message=message;
        this.start=start;
        this.size=size;
    }
    public String getEncryptedMessage(){
        String encryptedMessage="";
        for(int i=start;i<message.length();i=i+size){
            encryptedMessage+=message.charAt(i);

        }
        return encryptedMessage;
    }

}
public class VigenereCipher {
    public static void main(String[] args) {

        //every object should contain 3 attributes i.e message, start and size
        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number of test cases to be executed\n");
        int t=Integer.parseInt(myObj.nextLine());
        for(int i=0;i<t;i++){
            System.out.println("Enter the message to be encrypted\n");
            // Read user input
            String message = myObj.nextLine();
            System.out.println("Enter the starting index of the slice\n");
            int start=Integer.parseInt(myObj.nextLine());
            System.out.println("Enter the length of the slice\n");
            int size=Integer.parseInt(myObj.nextLine());
            //create object
            EncryptMessage encryptMessage=new EncryptMessage(message,start,size);
            System.out.println("The encrypted message is "+encryptMessage.getEncryptedMessage());


        }




    }


    }
