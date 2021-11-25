package GamleFiler;
/*
import java.sql.Connection;

public class DBTester {
    public static void main(String[] args){
        DBConn DBConnklasse = new DBConn();
        Connection connection = DBConnklasse.getConnection();
        AftalerDTO aftalerDTO = new AftalerDTO(connection);
        UsersDTO usersDTO = new UsersDTO(connection);


        // Test af indsætning i table
        String CPR = "2010001235";
        String TimeStart = "2021-10-31 07:45";
        String TimeEnd = "2021-10-31 08:00";
        String Notat = "notat tilføjes her";
        String KlinikID = "grp2";

        aftalerDTO.InsertIntoAftaler(CPR, TimeStart, TimeEnd, Notat, KlinikID);

        // test af data udtræk på cpr sorteret efter StartTime
        String searchCPR = "1234567890";
        System.out.println("Aftaler tilhørende: " + searchCPR);
        aftalerDTO.FindAftaler(searchCPR);

        // test af data udtræk af fuld table sorteret efter StartTime
        System.out.println("Alle aftaler i database");
        aftalerDTO.ShowAftaler();

        /*
        //test af oprettelse af bruger
        String brugernavn = "mfj";
        String kodeord = "1234";
        usersDTO.InsertIntoUsers(brugernavn, kodeord);*/



