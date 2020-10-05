import java.io.*;
import java.io.File;
import java.io.IOException;
public class Serialize  implements Serializable {
    Vector[] mas;
    public Serialize(Vector[] mas)
    {
        this.mas=mas;
    }
    public static class Main {

        public static void main(String[] args) throws IOException {

            FileInputStream fileInputStream = new FileInputStream("coords.txt");

            int i;
            String s="";
            String file =  "coords.txt";
            FileWriter fileWriter=new FileWriter("coords.txt");
            String coords="1 2 3 4 5 6";
            fileWriter.write(coords);
            fileWriter.flush();

            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            String[] array=line.split(" ");
            Double x1=new Double(array[0]);
            Double y1=new Double(array[1]);
            Double z1=new Double(array[2]);
            Double x2=new Double(array[3]);
            Double y2=new Double(array[4]);
            Double z2=new Double(array[5]);
            Vector vector1=new Vector(x1,y1,z1);
            Vector vector2=new Vector(x2,y2,z2);
            System.out.println(vector1.length());
            System.out.println(vector2.length());





        }

    }}


