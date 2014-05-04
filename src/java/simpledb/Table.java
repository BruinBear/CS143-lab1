package simpledb;

public class Table {
       
    /**
     *  Table name
     */

    private String tableName;


    /**
     *  Table contents
     */

    private DbFile data;
   
    /**
     *  Primary key
     */

    private String primaryKey;
   
    /**
     *  Name of Table
     */


    /**
     * Constructor of this table
     *
     * @param data the contents that are stored in this table
     * 
     * @param tableName the name of the table beiing constructed
     *
     * @param primaryKey the primary key that stores this table in hash map
     */
    public Table(DbFile data, String tableName, String primaryKey){
        this.tableName = tableName;
	this.data = data;
        this.primaryKey = primaryKey;    

    }
   
    /**
     * Returns the file data
     */
    public DbFile getFile(){
        return data;
    }
   
    /**
     * Returns table name
     */
    public String getTableName(){
        return tableName;
    }
   
    /**
     * Returns primary key associated with this table
     */
    public String getPrimaryKey(){
        return primaryKey;
    }
}
