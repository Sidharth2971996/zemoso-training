import java.lang.reflect.Array;
import java.util.*;
public class VampireNumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=1000;i<=9999;i++){
            if(CheckVampireNumber(i)==true){

                System.out.println(i);
            }
        }



    }

    public static boolean CheckVampireNumber(int a) {
        int x,dummy,remainder,i=0,vampire;

        boolean isvamp = false;

        int arr[] = new int[4];


        x = a;

        dummy = x;
        //counting the length of the argument
        while(dummy!=0){

            remainder = dummy%10;

            arr[i] = remainder;

            dummy = dummy/10;

            i++;

        }
        //taking all possible permutations
        for(int z=0;z<4;z++){

            for(int j=0;j<4;j++){

                for(int k=0;k<4;k++){

                    for(int l=0;l<4;l++){

                        int fang = (arr[z]*10 + arr[j]) * (arr[k]*10 + arr[l]);

                        if(fang==x){

                            isvamp = true;

                            break;

                        }

                    }

                }

            }

        }

        if(isvamp){

            return true;

        }

        else{

            return false;

        }
    }
}





