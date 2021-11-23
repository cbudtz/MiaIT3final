import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PatientDao {

    private List<Patient> patients = new ArrayList<>();
    private static PatientDao instance = new PatientDao();

    private PatientDao() {
        System.out.println("laver patienter");
        Patient Peter = new Patient();
        Patient Blessed = new Patient();
        Peter.setName("Peter");
        Blessed.setName("Blessed");
        patients.add(Peter);
        patients.add(Blessed);
    }

    public static PatientDao getInstance() {
        return instance;
    }

    public List<Patient> getPatients() {
        return patients;
}


    }
