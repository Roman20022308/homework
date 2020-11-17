public class Monoblock extends Desktopcoputer implements Visitor{
    String display;
    public Monoblock() {
        this.display = new Display().display;
    }
    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ozu+", "+"Дисплэй:"+this.display);
    }

    @Override
    public String hml() {
        return "<processor>"+processor+"</processor>"+"<harddisk>"+harddisk+"</harddisk>"+"<ozu>"+ozu+"</ozu>"+"<display>"+display+"</display>";
    }
}
