public interface Computer {
    String turnOn(int currentVoltage) throws ComputerTurnOnException;
    String turnOff() throws ComputerTurnOffException;
    enum ConnectionStatus{
        OK,
        NOT_OK
    }
    String connect(ConnectionStatus status) throws ComputerConnectionError;

}
