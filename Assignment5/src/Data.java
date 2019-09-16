public class Data {
    public static void main(String[] args) {
        int  a;
        char c;
        //Data.PrintVal(a,c); Uninitialized variables cant be passed into another method
    }
    public static  void PrintVal(int a,char c){
        System.out.println(a);
        System.out.println(c);
    }
}
