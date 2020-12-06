import java.net.SocketOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


public class main {
public static void main(String[] args) throws ComputerConnectionError {
    Desktop desktop=new Desktop("Desktop processor","Desktop harddisk","Desktop ram","Desktop videcard","q");
    Netbook netbook=new Netbook("Netbook processor","Netbook harddisk","Netbook ram","Netbook keyboard","Netbook display","q");
    Monoblock monoblock=new Monoblock("Monoblock processor","Monoblock harddisk","Monoblock ram","Monoblock display","e");
    Laptop laptop=new Laptop("Laptop processor","Laptop harddisk","Laptop ram","Laptop keyboard","Laptop display","r");
    Nettop nettop=new Nettop("Nettop processor","Nettop hardisk","Nettop ram","t");
    Server server=new Server("Server processor","Server harddisk","Server ram","y");
    ComputerImpl[] computers={desktop,netbook,monoblock,laptop,nettop,server};
    Comparator<ComputerImpl> comparator = new Comparator<ComputerImpl>(){
    public int compare(ComputerImpl o1, ComputerImpl o2) {
            if (o1.maker.equals(o2.maker)) {

                if ((int) o1.processor.hashCode() < (int) o2.processor.hashCode()) {
                    return -1;
                } else {
                    return 1;
                }
            }
            if ((int) o1.maker.hashCode() < (int) o2.maker.hashCode()) {
                return -1;
            }
            return 1;
        }};
    TreeSet<ComputerImpl> treeSet=new TreeSet<>(comparator);
    System.out.println(computers);
    for(int i=0;i<6;i++)
    {
        treeSet.add(computers[i]);
    }

System.out.println(treeSet);
    StrayPet strayPet=new StrayPet("Sasha",10);
    Taming<StrayPet,String> accept=(x,nameOfParent)->new HomePet(x.name,x.age,nameOfParent);
}


}

