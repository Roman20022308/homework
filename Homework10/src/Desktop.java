public class Desktop extends Desktopcoputer implements Visitor{
String videocard;
public Desktop(){
    this.videocard="Видеокарта ы";
}

    public String hml() {

        return "<processor>"+processor+"</processor>"+"<harddisk>"+harddisk+"</harddisk>"+"<ozu>"+ozu+"</ozu>"+"<videocard>"+videocard+"</videocard>";
    }
}

