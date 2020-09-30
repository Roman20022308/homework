public class main {

public static void main(String[] args) throws ComputerConnectionError {
    Desktop desktop=new Desktop("Desktop processor","Desktop harddisk","Desktop ram","Desktop videcard");
    Netbook netbook=new Netbook("Netbook processor","Netbook harddisk","Netbook ram","Netbook keyboard","Netbook display");
    Monoblock monoblock=new Monoblock("Monoblock processor","Monoblock harddisk","Monoblock ram","Monoblock display");
    Laptop laptop=new Laptop("Laptop processor","Laptop harddisk","Laptop ram","Laptop keyboard","Laptop display");
    Nettop nettop=new Nettop("Nettop processor","Nettop hardisk","Nettop ram");
    Server server=new Server("Server processor","Server harddisk","Server ram");

    Computer[] computers={desktop,netbook,monoblock,laptop,nettop,server};
    for(int i=0;i<6;i++)
    {try{
        System.out.println(computers[i].turnOn(250));
        System.out.println(computers[i].connect(Computer.ConnectionStatus.OK));
        System.out.println(computers[i].turnOff());


        System.out.println();}
        catch (ComputerTurnOnException e)
        {
            System.out.println(e.getMessage()+" для "+computers[i].getClass());}

        catch (ComputerTurnOffException e)
        {System.out.println(e.getMessage()+" для "+computers[i].getClass());}

    }


}

}

