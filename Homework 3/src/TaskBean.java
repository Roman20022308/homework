import java.beans.beancontext.BeanContext;
import java.io.*;
import java.nio.file.*;

public class TaskBean{
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) throws IOException {
        try {
            handleExceptions();

        }
        catch (FileSystemException e)
        {
            BEAN.log(e);
        }
    }
    public static void handleExceptions() throws IOException {
        try {

            BEAN.methodThrowExceptions();

        }
        catch (CharConversionException e)
        {
            BEAN.log(e);
        }
        catch (FileSystemException e)
        {
            BEAN.log(e);
            throw e;
        }
        catch (IOException e)
        {
            BEAN.log(e);

        }

    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public static void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);



                if (i == 0) {
                    throw new CharConversionException();
                } else if (i == 1) {
                    throw new FileSystemException("");
                } else if (i == 2) {
                    throw new IOException();
                }



        }
    }

}