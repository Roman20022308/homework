import java.util.ArrayList;

public class Game {
    public static void main(String[] args){
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;


        public static ArrayList<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Player 1", 3);
        protected Gamer gamer2 = new Gamer("Player 2", 1);
        protected Gamer gamer3 = new Gamer("Player 3", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();



        }
    }
    public static class Gamer extends Thread {
        private int rating, numberStep;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
            this.numberStep = 0;
        }

        @Override
        public void run() {
            numberStep = 0;
            while (!OnlineGame.isWinnerFound) {
                try {
                    Thread.sleep((1000 / rating));
                    System.out.println(this.getName() + ":" + OnlineGame.steps.get(numberStep));
                    numberStep += 1;

                    if (numberStep == 3) {
                        System.out.println(this.getName() + ":" + "одержал победу");
                        OnlineGame.isWinnerFound = true;
                        this.interrupt();

                    }
                } catch (InterruptedException e) {
                    System.out.println(this.getName() + ":" + "проиграл");
                }
            }
        }}}
