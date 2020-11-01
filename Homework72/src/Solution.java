import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Horse> horses = prepareHorsesAndStart(10);
        while (calculateHorsesFinished(horses) != horses.size()) {
        }
        System.out.println("Все лошади финишировали");
    }

    public static int calculateHorsesFinished(ArrayList<Horse> horses) throws InterruptedException {
        int finishedCount = 0;





        for (Horse horse:horses)
        {if(!horse.isFinished()){ System.out.println("Waiting for " + horse.getName()); }


        else {
            horse.isFinished = true;


            finishedCount += 1;

        }



    }



        return finishedCount;
    }

    public static ArrayList<Horse> prepareHorsesAndStart(int horseCount) {
        ArrayList <Horse> horses = new ArrayList<Horse>(horseCount);
        String number;
        for (int i = 1; i < horseCount + 1; i++) {
            number = i < 10 ? ("0" +  i) : "" + i;
            horses.add(new Horse("Horse_" + number));
        }

        for (int i = 0; i < horseCount; i++) {
            horses.get(i).start();
        }
        return horses;
    }

    public static class Horse extends Thread {

        private boolean isFinished;

        public Horse(String name) {
            super(name);
        }

        public boolean isFinished() {
            return isFinished;
        }

        public void run() {
            String s = "";
            for (int i = 0; i < 1001; i++) {   // Delay
                s += "" + i;
                if (i == 1000) {
                    s = " has finished the race!";
                    System.out.println(getName() + s);
                    isFinished = true;
                }
            }
        }
    }
}
