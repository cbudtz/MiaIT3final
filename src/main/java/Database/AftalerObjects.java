package Database;

public class AftalerObjects {
    // bruges i SeDataController, når data hentes til tableView
    int id;
    String CPR;
    String TimeStart;
    String TimeEnd;
    String Notat;
    String KlinikID;


    public AftalerObjects(int id, String CPR, String TimeStart, String TimeEnd, String Notat, String KlinikID) {
        this.id = id;
        this.CPR = CPR;
        this.TimeStart = TimeStart;
        this.TimeEnd = TimeEnd;
        this.Notat = Notat;
        this.KlinikID = KlinikID;
    }

}
