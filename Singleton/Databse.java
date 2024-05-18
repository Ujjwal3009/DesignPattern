package DesignPattern.Singleton;
class Database{
    private static Database db;
    private Database(){

    }

    public Database getInstance(){
        if(db == null) db = new Database();
        return db;
    }
}