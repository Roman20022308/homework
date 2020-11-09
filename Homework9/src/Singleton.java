public final class Singleton {
    private static Singleton instance;
    String value;

    private Singleton(String value) {

        // Этот код эмулирует медленную инициализацию
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;

    }

    static Singleton getInstance(String value)
    {
        if (instance == null) {
            synchronized(Singleton.class){
            instance = new Singleton(value);}
        }
        return instance;
    }




}

