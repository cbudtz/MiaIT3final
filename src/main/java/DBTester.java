import java.sql.Connection;

public class DBTester {
    public static void main(String[] args){
        DBConn DBConnklasse = new DBConn();
        Connection connection = DBConnklasse.getConnection();
    }
}
