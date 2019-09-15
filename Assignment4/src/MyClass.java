import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        //create Scanner object to take input
        Scanner inp=new Scanner(System.in);
        //t takes the number of inputs
        int t=inp.nextInt();
        inp.nextLine();
        //loop for all inputs
        for(int i=0;i<t;i++){
            String s=inp.nextLine();
            //splitting the input by space to separate the start and end date
            String [] date=s.split(" ");
            //split the start date by "-" to separate date,month and year
            String [] startDate=date[0].split("-");
            //create object start
            Calendar start=new GregorianCalendar(Integer.parseInt(startDate[2]),Integer.parseInt(startDate[1])-1,Integer.parseInt(startDate[0]));
            //split the end date by "-" to separate date,month and year
            String [] endDate=date[1].split("-");
            //create object start
            Calendar end=new GregorianCalendar(Integer.parseInt(endDate[2]),Integer.parseInt(endDate[1])-1,Integer.parseInt(endDate[0]));

            MyClass.DisplayInterval(start,end);



        }


        //cal.add(Calendar.DAY_OF_MONTH, -1);
        //Define Format of date


    }
    public static int DisplayInterval(Calendar start,Calendar end){
        //set display format
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String val = sdf.format(start.getTime());
        //get the end date year
        int year=end.get(Calendar.YEAR);
        //set the start date year as the end date year
        start.set(Calendar.YEAR,year);
        //subtract 30 days from the start date
        start.add(Calendar.DAY_OF_MONTH,-30);
        //if start and end date are both same, we dont have any range and so print "No Range"
        if(start.compareTo(end)==0){
            System.out.println("No Range");
            return 0;
        }
        //print one month previous value
        System.out.print(sdf.format((start.getTime())));
        //print one month next value
        start.add(Calendar.DAY_OF_MONTH,60);
        //if start value is greater than end, take the end value
        if(start.compareTo(end)==1){



                val = sdf.format(end.getTime());

                System.out.println(" " + val);


        }
        //if start value is lesser than end, take the start value
        else if(start.compareTo(end)==-1){
            val = sdf.format(start.getTime());
            System.out.println(" " + val);

        }
        return 0;
    }
}
