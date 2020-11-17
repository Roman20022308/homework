import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class razdel {
    public razdel() {
    }

    public static void main(String[] args) {
        new HashMap();
        Scanner console = new Scanner(System.in);
        String path1 = console.nextLine();
        String path2 = console.nextLine();
        String path3 = console.nextLine();
        new StringBuilder();

        try {
            FileInputStream fis = new FileInputStream(new File(path1));
            FileOutputStream fos2 = new FileOutputStream(new File(path2));
            FileOutputStream fos3 = new FileOutputStream(new File(path3));
            byte[] byteList = fis.readAllBytes();
            int count1 = (byteList.length + 1) / 2;

            int i;
            for(i = 0; i < count1; ++i) {
                fos2.write(byteList[i]);
            }

            for(i = count1; i < byteList.length; ++i) {
                fos3.write(byteList[i]);
            }

            fis.close();
            fos2.close();
            fos3.close();
        } catch (Exception var13) {
            var13.printStackTrace();
        }

    }
}
