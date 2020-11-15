public class Laptop extends PortableComputer implements Visitor {
    String keyboard,display;
    public Laptop() {
        this.keyboard=new Keyboard().keyboard;
        this.display=new Display().display;
    }
    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ozu+" "+this.display+" "+this.keyboard);
    }

    @Override
    public String hml() {
        return "<processor>"+processor+"</processor>"+"<harddisk>"+harddisk+"</harddisk>"+"<ozu>"+ozu+"</ozu>"+"<keyboard>"+keyboard+"</keyboard>"+"<display>"+display+"</display>";
    }
}
