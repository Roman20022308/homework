public class Server extends ComputerImpl{

    public Server(String processor, String harddisk, String ram,String maker) {
        super(processor, harddisk, ram,maker);
        this.maxvoltage=380;
    }

    @Override
    public int compareTo(ComputerImpl o) {
        return 0;
    }
}
