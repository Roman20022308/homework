import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Aciil {
    public int eng( String parampath)
    {
        String path =parampath;
        int i;
        int sum=0;
        try {
            InputStream is = new FileInputStream(path);

            while ((i=is.read())!=-1)
            {
                if((97<=i&&i<=122)|(65<=i&&i<=90))
                {
                    sum+=1;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sum;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Aciil aciil=new Aciil();
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.println(aciil.eng(name));




    }

}
