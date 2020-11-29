import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Number {
    Number(){}
    public void names(String name1, String name2)
    {
        int i;
        try {

            BufferedReader bufferedReader=new BufferedReader(new FileReader(name1));
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(name2));

            String part="";
            while ((i=bufferedReader.read())!=-1)
            {
                if(i==32|i==10)
                {
                    try {

                        int s=Integer.parseInt(part);
                        bufferedWriter.write(part+" ");
                    System.out.println(Integer.parseInt(part));
                    part="";
                    }
                    catch (Exception e)
                    {
                        part="";
                    }
                }
                else
                {
                    part+=((char) i);
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name1 = console.nextLine();
        String name2 = console.nextLine();
        Number number=new Number();
        number.names(name1,name2);
    }
}
