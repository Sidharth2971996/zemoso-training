//abstract methods are present so the class should be declared as abstract class
abstract class Rodents {
    Rodents(){
        System.out.println("Rodents Object created");
    }
    public abstract void NumberofTeeth();
    public abstract void FoodHabits();
    public abstract void NumberofLimbs();

}
//Mouse class inherits from Rodents class and overrides the abstract methods
class Mouse extends Rodents{
    Mouse(){
        System.out.println("Mouse object created");
    }

    @Override
    public void NumberofTeeth() {
        System.out.println("A mouse has 16 teeths");
    }

    @Override
    public void FoodHabits() {
        System.out.println("Mouse eat grains");
    }

    @Override
    public void NumberofLimbs() {
        System.out.println("Mouse has 4 limbs");
    }
}
//Hamster class inherits from Rodents class and overrides thee abstract methods
class Hamster extends Rodents{

    @Override
    public void NumberofTeeth() {
        System.out.println("A hamster has 20 teeths");
    }

    @Override
    public void FoodHabits() {
        System.out.println("A hamster eats wheat grains");
    }

    @Override
    public void NumberofLimbs() {
        System.out.println("A hamster has 4 limbs");
    }
}

public class MyClass{
    public static void main(String[] args) {

        Mouse m1=new Mouse();
        Mouse m2=new Mouse();
        Hamster h1=new Hamster();
        Hamster h2=new Hamster();
        //Array of Rodents
        Rodents [] Arr=new Rodents[4];

        Arr[0]=m1;//mouse class methods will be called for this object
        Arr[1]=m2;//mouse class methods will be called for this object
        Arr[2]=h1;//hamster class methods will be called for this object
        Arr[3]=h2;//hamster class methods will be called for this object
        for(int i=0;i<Arr.length;i++){
            //the child class version of the method wil be called
            Arr[i].FoodHabits();

        }


    }







}
