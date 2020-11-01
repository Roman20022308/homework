public class MyClock extends Thread {
    int time;
    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (!current.isInterrupted())
        {time+=1;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

            if(time%2==1){
                System.out.println("Tik");}
            else {System.out.println("Tok");}
            break;
        }
        if(time%2==1){
        System.out.println("Tik");}
        else {System.out.println("Tok");}

    }}
}
