abstract class ComputerImpl implements Computer {
    String processor,harddisk,ram;
    int maxvoltage;
    boolean isOn;



    public ComputerImpl(String processor,String harddisk,String ram){

        this.processor=processor;
        this.harddisk=harddisk;
        this.ram=ram;
        this.maxvoltage=0;
        this.isOn=false;

    }

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String toString()
    {
        return ("Процессор:"+this.processor+", "+"Тяжёлый диск:"+this.harddisk+", "+"ОЗУ:"+this.ram);
    }
    public String turnOn(int currentVoltage) throws ComputerTurnOnException {
        if(currentVoltage<this.maxvoltage){
            throw new ComputerTurnOnException("Слишком маленкое напряжение");
        }
        this.isOn=true;

        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() throws ComputerTurnOffException  {
        if(this.isOn)
        {this.isOn=false;}
        else
        {throw new ComputerTurnOffException("компьютор не включён");}

        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect(ConnectionStatus status) throws ComputerConnectionError{
        if(this.isOn&&status==ConnectionStatus.OK)
        {return "Connect to internet "+getClass().getSimpleName()+" "+toString();}
        else {throw new ComputerConnectionError();}




    }
}
