package Database;

import java.sql.*;
import java.util.ArrayList;

public class AftalerDTO {
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public AftalerDTO(Connection connection) {
        this.connection = connection;
    }

    // Test til indsætning i database table med et statement ad gangen, kun brugt til test
    public void InsertIntoAftaler(String value1, String value2, String value3, String value4, String value5) {
        String SQLAftaler = "INSERT INTO Aftaler (CPR, TimeStart, TimeEnd, Notat, KlinikID) VALUES (?,?,?,?,?)";
        try {
            preparedStatement = connection.prepareStatement(SQLAftaler);
            preparedStatement.setString(1, value1);
            preparedStatement.setString(2, value2);
            preparedStatement.setString(3, value3);
            preparedStatement.setString(4, value4);
            preparedStatement.setString(5, value5);
            preparedStatement.execute();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    // Se id, måling og dato fra tabellen der matcher CPR, kun brugt til test
    public ArrayList<AftalerObjects> FindAftaler(String CPR) {

        ArrayList liste = new ArrayList();

        String SQLResults = "SELECT id, CPR, TimeStart, TimeEnd, Notat, KlinikID FROM Aftaler WHERE CPR = "
                + CPR + ";";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(SQLResults);

            while (resultSet.next()) {
                System.out.println(
                        "id: " + resultSet.getInt("id") +
                                "   Klinik Id: " + resultSet.getString("KlinikID") +
                                "   TimeStart: " + resultSet.getString("TimeStart") +
                                "   TimeEnd: " + resultSet.getString("TimeEnd") +
                                "   Notat: " + resultSet.getString("notat") + "\n"
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return liste;
    }

}
