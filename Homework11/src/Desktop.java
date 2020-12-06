public class Desktop extends DesktopComputer{
String videocard;


    public Desktop(String processor, String harddisk, String ram, String videocard,String maker) {
        super(processor, harddisk, ram,maker);
        this.videocard=videocard;
        this.maxvoltage=220;
    }
}
