public class Desktop extends DesktopComputer{
String videocard;


    public Desktop(String processor, String harddisk, String ram, String videocard) {
        super(processor, harddisk, ram);
        this.videocard=videocard;
        this.maxvoltage=220;
    }
}
