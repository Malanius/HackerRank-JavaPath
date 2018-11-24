class Singleton {

    private static Singleton instance = new Singleton();
    public String str;

    private Singleton() {

    }

    static Singleton getSingleInstance() {
        return instance;
    }
}
