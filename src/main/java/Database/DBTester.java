package Database;

import java.sql.Connection;

public class DBTester {
    public static void main(String[] args){
        DBConn DBConnklasse = new DBConn();
        Connection connection = DBConnklasse.getConnection();
        AftalerDTO aftalerDTO = new AftalerDTO(connection);

        // Test af indsætning i table
        String CPR = "1234567890";
        String TimeStart = "2021-11-12 10:05";
        String TimeEnd = "2021-11-12 11:00";
        String Notat = "notat tilføjes her";
        String KlinikID = "grp2";

        aftalerDTO.InsertIntoAftaler(CPR, TimeStart, TimeEnd, Notat, KlinikID);

        // test af data udtræk
        String søgtCPR = "1234567890";
        aftalerDTO.FindAftaler(søgtCPR);
    }
}
