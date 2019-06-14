import java.util.HashMap;

public class MyDataStore {
    HashMap<String, String> MyDb = new HashMap<String, String>();

    public MyDataStore() {
        this.MyDb.put("zelalem", "123");
        this.MyDb.put("john", "345");
        this.MyDb.put("smith", "784");
        this.MyDb.put("henok", "653");
        this.MyDb.put("henok", "653");
    }

    public HashMap<String, String> getMyDb() {
        return MyDb;
    }
}
