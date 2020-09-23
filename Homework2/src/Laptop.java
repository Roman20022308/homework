public class Laptop extends PortableComputer {
    String keyboard,display;
    public Laptop() {
        this.keyboard=new Keyboard().keyboard;
        this.display=new Display().display;
    }
    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ozu+" "+this.display+" "+this.keyboard);
    }
}
