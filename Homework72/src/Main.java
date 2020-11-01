public  class Main {
    public static void main(String[] args) throws InterruptedException {

        MyClock myClock=new MyClock();
        myClock.start();
        Thread.sleep(1000);
        myClock.interrupt();
        myClock.join();
        System.out.println("тик ток закончился");


    }

}
