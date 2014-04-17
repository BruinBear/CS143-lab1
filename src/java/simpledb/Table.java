package simpledb;

public class Table {
       
    //Name of Table
    private String tableName;

    //Contents of the table
    private DbFile data;
   
    //Primary key
    private String primaryKey;
   
    // Table constructor
    public Table(DbFile data, String tableName, String primaryKey){
        this.tableName = tableName;
	this.data = data;
        this.primaryKey = primaryKey;    

    }
   
    // reuturn file data
    public DbFile getFile(){
        return data;
    }
   
    //return tableName
    public String getTableName(){
        return tableName;
    }
   
    //return primary key
    public String getPrimaryKey(){
        return primaryKey;
    }
}
