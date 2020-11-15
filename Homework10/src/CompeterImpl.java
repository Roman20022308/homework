abstract class ComputerImpl implements Computer,Visitor {
    String processor,harddisk,ozu;
    public ComputerImpl(){

        this.processor="Asus";
        this.harddisk="очень тяжелый диск";
        this.ozu="озу топ";

    }

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ozu);
    }
    public String turnOn() {

        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }

    @Override
    public String hml() {

        return "<processor>"+processor+"</processor>"+"<harddisk>"+harddisk+"</harddisk>"+"<ozu>"+ozu+"</ozu>";
    }
}
