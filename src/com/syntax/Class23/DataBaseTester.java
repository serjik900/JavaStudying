package Class23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new MicrosoftDataBase();
        dataBase.openDataBase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
