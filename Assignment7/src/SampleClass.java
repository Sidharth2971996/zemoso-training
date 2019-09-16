abstract class Cycle{
    public abstract void NumberOfTyres();
    public abstract void Speed();
}
class Unicycle extends Cycle{

    @Override
    public void NumberOfTyres() {
        System.out.println("Number of tyres in Unicycle is 1");
    }

    @Override
    public void Speed() {
        System.out.println("The maximum speed of Unicycle is 5 kmph");

    }
    public void Balance(){
        System.out.println("Unicycle is difficult to balance");
    }
}
class Bicycle extends Cycle{

    @Override
    public void NumberOfTyres() {
        System.out.println("The number of tyres in a bicycle is 2");
    }

    @Override
    public void Speed() {
        System.out.println("The maximum speed of Bicycle is 7 kmph");
    }
    public void Balance(){
        System.out.println("Bicycle is easy to balance");
    }
}
class Tricycle extends Cycle{

    @Override
    public void NumberOfTyres() {
        System.out.println("Number of tyres in a tricycle is 3");
    }

    @Override
    public void Speed() {
        System.out.println("The maximum speed of a tricycle can be 10 kmph");

    }
}
public class SampleClass {
    public static void main(String[] args) {
        Unicycle u=new Unicycle();
        Bicycle b=new Bicycle();
        Tricycle t=new Tricycle();
        Cycle [] arr=new Cycle[3];
        arr[0]=u;
        arr[1]=b;
        arr[2]=t;
        // If we call balance method on Cycle object, it will throw error since Balance is not an abstract method.
        /*
        for(int i=0;i<arr.length;i++){
            try{
                System.out.println(arr[i].Balance());
            }
            catch(Exception e){
                System.out.println(e);
            }

        }*/

        u.Balance();
        b.Balance();
        //t.Balance() This will raise an error

    }
}
