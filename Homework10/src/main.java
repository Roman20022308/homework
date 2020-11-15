import java.io.*;
import java.util.*;
public class main {

public static void main(String[] args)
{
    Visitor[] computers={new Desktop(),new Netbook(), new Monoblock(),new Laptop(),new Nettop(),new Server()};
    String[] names={"Desktop","Netbook","Monoblock","Laptop","Nettop","Server"};
    for(int i=0;i<6;i++)
    {
        File file=new File(names[i]);
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(file);

            fileOutputStream.write( (computers[i].hml()).getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }




    }


}

}

