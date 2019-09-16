interface UniCycle{
    void speed(int s);
    void color(String c);
}
interface BiCycle{
    void speed(int s);
    void color(String c);
    void Balance();
}
interface TriCycle{
    void speed(int s);
    void color(String c);
}
class AtlasCycle implements UniCycle,BiCycle,TriCycle{

    @Override
    public void speed(int s) {
        System.out.println("Max speed is "+s+" kmph");
    }

    @Override
    public void color(String c) {
        System.out.println("Color of the Cycle is "+c);

    }

    @Override
    public void Balance() {
        System.out.println("AtlasCycles are easy to balance");

    }
    public int price(){
        return 4000;
    }


}
public class InerfaceExample {
    public static void main(String[] args) {
        AtlasCycle c1=new AtlasCycle();
        c1.speed(15);
        c1.color("Red");
        c1.Balance();
        System.out.println("The price of the Cycle is "+c1.price());
    }

}
