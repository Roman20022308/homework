public class Netbook extends PortableComputer{

    Keyboard keyboard=new Keyboard("");
    Display display=new Display("");

    public Netbook(String processor, String harddisk, String ram,String keyboard,String display) {
        super(processor, harddisk, ram);
        this.keyboard.keyboard=keyboard;
        this.display.display=display;
        this.maxvoltage=5;
    }

    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ram+", "+"Дисплэй:"+this.display+", "+"Клавиатура:"+this.keyboard);
    }


}
