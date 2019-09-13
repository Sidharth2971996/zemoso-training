import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class getMedian{
    //this method takes an array list as argument and calculates the median of that array list
    public static double CalculateMedian(ArrayList arr){
        Collections.sort(arr);
        int mid=(int)(arr.size()/2);
        //if length is even, return average of the 2 mid terms
        if(arr.size()%2==0){
            double ans=(double)arr.get(mid)+(double)arr.get(mid+1);
            ans=ans/2;
            return ans;
        }
        //if length is odd, return the mid element
        return (double)arr.get(mid);
    }
}
public class PingUrl {
        public static void main(String[] args) {
            Scanner inp=new Scanner(System.in);
            System.out.println("Enter the ip address you want to ping\n");
            String ip = inp.nextLine();
            System.out.println("Enter the number of times you want to ping\n");
            int NumberofPings=inp.nextInt();


            String pingResult = "";

            String pingCmd = "ping " + ip;
            try {
                Runtime r = Runtime.getRuntime();
                Process p = r.exec(pingCmd);
                ArrayList<Double> timetracker=new ArrayList<Double>();

                BufferedReader in = new BufferedReader(new
                        InputStreamReader(p.getInputStream()));
                String inputLine;
                //var is used to keep track how many times user wants to ping the ip
                int var=0;
                while ((inputLine = in.readLine()) != null) {
                    var+=1;
                    if(var==1){
                        continue;
                    }
                    if(var>NumberofPings+1){
                        break;
                    }
                    System.out.println(inputLine);
                    //store the ping details in an arraylist
                    String[] arr=inputLine.split(" ");
                    //add times to timetracker
                    timetracker.add(Double.parseDouble(arr[6].substring(5,arr[6].length())));


                }
                //pass timetracker to CalculateMedian to get the median
                System.out.println("The median is "+ getMedian.CalculateMedian(timetracker)+" ms");

                in.close();

            } catch (IOException e) {
                System.out.println(e);
            }
        }

    }
