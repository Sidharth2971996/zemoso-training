class PrintVal{
     PrintVal(String s){
        System.out.println(s);

    }
}
public class Singleton {
    public static void main(String[] args) {
        //initilize s as we cant pass uninitialized values to a method
        String s="";
        //call the static method from the main method
        s=Singleton.Initialize(s);
        //create an object PrintVal to print the values from a non static method
        PrintVal a=new PrintVal(s);




    }
    //Initializes the given string to "Hello World" and returns the re-initialized string
    static String Initialize(String s){
        s="Hello World";
        return s;
    }
    //Static method to print a String
    static void PrintVarValues(String s){
        System.out.println(s);
    }


}
