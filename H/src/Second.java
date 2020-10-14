//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Scanner;

public class Second {
    public Second() {
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> a2 = new ArrayList();
        ArrayList<Integer> a3 = new ArrayList();
        ArrayList<Integer> aothers = new ArrayList();
        Scanner console = new Scanner(System.in);

        for(int i = 0; i < 20; ++i) {
            int k = console.nextInt();
            if (k % 2 == 0) {
                a2.add(k);
            }

            if (k % 3 == 0) {
                a3.add(k);
            }

            if (k % 2 != 0 && k % 3 != 0) {
                aothers.add(k);
            }
        }

        printList(a3);
        printList(a2);
        printList(aothers);
    }

    public static void printList(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i));
            System.out.print(" ");
        }

        System.out.println();
    }
}
