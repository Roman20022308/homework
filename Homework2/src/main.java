public class main {

public static void main(String[] args)
{
    Computer[] computers={new Desktop(),new Netbook(), new Monoblock(),new Laptop(),new Nettop(),new Server()};
    for(int i=0;i<6;i++)
    {
        System.out.println(computers[i].turnOn());
        System.out.println(computers[i].turnOff());
        System.out.println(computers[i].connect());
        System.out.println();
    }


}

}

