package Class23;

public abstract class DataBase {
    abstract void openDataBase();

    abstract void readData();

    abstract void writeData();

    abstract void closeDatabase();
}

class MicrosoftDataBase extends DataBase {

    @Override
    void openDataBase() {
        System.out.println("Opening the Microsoft DataBase");
    }

    @Override
    void readData() {
        System.out.println("Reading the microsoft DataBase");
    }

    @Override
    void writeData() {
        System.out.println("writing the data to MSDataBase");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the MSDatabase");
    }
}
