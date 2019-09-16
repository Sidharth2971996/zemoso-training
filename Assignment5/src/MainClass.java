public class MainClass {
    public static void main(String[] args) {
        //create object of Data class
        Data data=new Data();
        //Call PrintVal method of the Data Class
        data.PrintVal(1,'A');
        //Create Object of Singleton Class
        Singleton singleton=new Singleton();

        String s="Zemoso";
        //Call Initialize method of the Singleton Class. We cant pass uninitialized variable to any method
        s=singleton.Initialize(s);
        //Call PrintVarValues of the Singleton Class to print the re-initialized value of s
        singleton.PrintVarValues(s);


    }
}
