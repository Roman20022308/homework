public class Monoblock extends Desktopcoputer{
    String display;
    public Monoblock() {
        this.display = new Display().display;
    }
    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ozu+", "+"Дисплэй:"+this.display);
    }

}
