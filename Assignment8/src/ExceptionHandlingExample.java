//exception for handling age
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}
//exception for checking if someone is a student
class StudentNotEligible extends Exception{
    StudentNotEligible(String s){
        super(s);
    }
}
class TestCustomException1 {

    static void validate(int age,boolean student) throws InvalidAgeException,StudentNotEligible {
        //if someone has age<18, he/she cant vote and hence throw InvalidAgeException
        if (age < 18)
            throw new InvalidAgeException("Age is not valid to vote");
        else
            System.out.println("welcome to vote");
        //if someone is a student, he/she cant stand in elections and hence throw StudentNotEligible exception
        if(student){
            throw new StudentNotEligible("Students are not eligible to stand in elections");
        }
        else{
            System.out.println("You can contest elections");
        }
    }

}
public class ExceptionHandlingExample {
    public static void main(String[] args) {

        try{
            TestCustomException1.validate(18,false);
        }
        //if try statement is not successfull, catch will run
        //this catch will catch the Invalid age exception
        catch(InvalidAgeException m)
        {
            System.out.println("Exception occured: "+m);
        }
        //this catch will handle the StudentNotEligible exception
        catch(StudentNotEligible e){
            System.out.println("Exception Occured"+e);
        }
        //finally statement will always run irrespective of try and catch statement
        finally {
            System.out.println("Voting is our birth right");
        }

    }
}
