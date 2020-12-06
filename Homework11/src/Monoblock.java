public class Monoblock extends DesktopComputer{
    Display display=new Display("");
    public Monoblock(String processor, String harddisk, String ram,String display,String maker) {
        super(processor, harddisk, ram,maker);
        this.display.display=display;
        this.maxvoltage=220;
    }

    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ram+", "+"Дисплэй:"+this.display);
    }

}
