import java.io.*;

class ReadingFile{
    BufferedReader br;//this variable is for storing Buffered data
    public int malenames=0;//counts the total number of unique male names
    public int femalenames=0;//counts the total number of unique female names
    //parametrized construtor
    public ReadingFile(BufferedReader br) throws IOException {
        this.br=br;
    }


    //this method counts the total number of boys born in a particular year
    public int getTotalBoys() throws IOException {

        String line="";
        int countMale=0;


        while((line=br.readLine())!=null){
            String[] tempstr=line.split(",");
            if((tempstr[1]).equals("M")){
                countMale+=Integer.parseInt(tempstr[2]);
                malenames+=1;
            }
        }
        return countMale;

    }
    //this method counts the total number of girls born in a particular year
    public int getTotalGirls() throws IOException {

        String line="";

        int countFemale=0;


        while((line=br.readLine())!=null){

            String[] tempstr=line.split(",");

            if((tempstr[1]).equals("F")){
                countFemale+=Integer.parseInt(tempstr[2]);
                femalenames+=1;
            }
        }

        return countFemale;


    }
    //counts the total number of unique male names in a particular year
    public int totalFemaleNames(){
        return femalenames;
    }
    //counts the total number of unique female names in a particular year
    public int totalMaleNames(){
        return malenames;
    }
}
//BabyNameUS contains the main class
public class BabyNameUS {

    public static void main(String[] args) throws IOException {
        File file=new File("yob2012short.csv");
        FileReader filereader=new FileReader(file);
        BufferedReader br=new BufferedReader(filereader);

        ReadingFile f1=new ReadingFile(br);
        br.mark(100000);
        System.out.println("total number of males born this year is "+f1.getTotalBoys());
        br.reset();

        System.out.println("total number of females born this year is "+f1.getTotalGirls());
        System.out.println("total number of male names is "+f1.totalMaleNames());
        System.out.println("total number of female names is "+f1.totalFemaleNames());


    }
}
