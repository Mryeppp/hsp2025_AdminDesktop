package Chapter10.Interface;

public class DBManager {
    public static void TestDB(DBinterface dbinterface){
        dbinterface.connect();
        dbinterface.close();
    }
}

