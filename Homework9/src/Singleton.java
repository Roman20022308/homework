public final class Singleton {
    private static Singleton instance;
    String value="s";
    private Singleton(String value) {
        this.value = value;
    }

    static Singleton getInstance(String value)
    {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }




}

