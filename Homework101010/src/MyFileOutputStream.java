import java.io.*;
import java.util.Scanner;

class MyfileOutputStream implements MyfileOutputStreamInteface {
    @Override
    public void close() {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        Scanner console = new Scanner(System.in);
        String answer = console.nextLine();
        if(answer.equals("Д"))
        {
            this.close();
        }
    }
}



