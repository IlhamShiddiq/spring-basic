package spring_practice.spring_basic.v2;

// Singleton Practice
public class Database {
    private static Database database;

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }

    private Database() {
        //
    }
}
