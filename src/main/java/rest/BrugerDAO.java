package rest;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BrugerDAO {

    public static PatientService getInstance() {
    }

    public Bruger findBruger(String brugernavn) {
        Connection connection = MySQLDB.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE username = ? ");
            preparedStatement.setString(1, brugernavn);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String password = resultSet.getString("password");
                Bruger bruger = new Bruger();
                bruger.setBrugernavn(brugernavn);
                bruger.setPassword(password);
                return bruger;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}