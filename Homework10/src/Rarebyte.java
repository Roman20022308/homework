
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Rarebyte {
    public Rarebyte() {
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> bytes = new HashMap();
        Scanner console = new Scanner(System.in);
        String path = console.nextLine();
        console.close();
        int maxbyte = 0;
        new StringBuilder();

        int mincount;
        try {
            FileInputStream fis = new FileInputStream(new File(path));

            while((mincount = fis.read()) != -1) {
                if (bytes.containsKey(mincount)) {
                    bytes.put(mincount, (Integer)bytes.get(mincount) + 1);
                } else {
                    bytes.put(mincount, 1);
                }
            }

            fis.close();
        } catch (Exception var10) {
            var10.printStackTrace();
        }

        mincount = bytes.keySet().size();
        HashSet<Integer> hashSet = new HashSet();
        Iterator var8 = bytes.keySet().iterator();

        int i;
        while(var8.hasNext()) {
            i = (Integer)var8.next();
            if (mincount > (Integer)bytes.get(i)) {
                hashSet = new HashSet();
                hashSet.add(i);
                mincount = (Integer)bytes.get(i);
            } else if (mincount == (Integer)bytes.get(i)) {
                hashSet.add(i);
            }
        }

        System.out.println(bytes);
        var8 = hashSet.iterator();

        while(var8.hasNext()) {
            i = (Integer)var8.next();
            System.out.println(i);
        }

    }
}
