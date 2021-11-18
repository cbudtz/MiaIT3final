import java.sql.*;

public class DBConn {
    private Connection connection;
    String schema = "s205487";
    String db_url = "jdbc:mysql://mysql-db.caprover.diplomportal.dk:3306/" + schema;
    private String JDBC_driver = "com.mysql.cj.jdbc.Driver";

    public Connection getConnection() {
        try{
            Class.forName(JDBC_driver);
            String user = "s205487";
            String password = "zDRQReBWgpShFUe1VxYWZ";
            connection = DriverManager.getConnection(db_url+"?serverTimezone=Europe/Amsterdam&amp", user, password);
        }catch (SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
            System.out.println("Fejl i forbindelse til database");
        }
        if (connection !=null){
            System.out.println("forbindelse til db oprettet");
        }
        return connection;
    }
}
