public class Log {


    public static void main(String[] args) {
        log("In main method");



 


    }



    public static void log(String s) {

        String method=(Thread.currentThread().getStackTrace()[2].getMethodName());

        String classs= Thread.currentThread().getStackTrace()[2].getClassName();
        System.out.println("your.packet."+classs+": "+method+": "+s);
    }


}
