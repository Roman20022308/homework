public class Netbook extends PortableComputer{
    String keyboard,display;
    public Netbook() {
        this.keyboard = new Keyboard().keyboard;
        this.display = new Display().display;
    }
    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ozu+", "+"Дисплэй:"+this.display+", "+"Клавиатура:"+this.keyboard);
    }
    }
