import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("patients")
public class PatientService {
    @GET
    @Produces(MediaType.APPLICATION_JSON) {
        public List<Patient> getPatients () {
            return PatientDao.getInstance().getPatients();
        }

    }
    @GET
    @Path("{cpr}")
    @Produces(MediaType.APPLICATION_JSON)
    public Patient getPatient(@PathParam("cpr") String cpr){
        return PatientDao.getInstance().getPatientBycpr(cpr);

    }

    @DELETE
    @Path("{cpr}")
    public void  deletePatient(@PathParam("cpr") String cpr){
        PatientDao.getInstance().deletePatientByCpr(cpr);
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Patient postPatient(Patient p) {
        System.out.println("paitent " + p);
        PatientDao.getInstance().getPatient().add(p);
        PatientDao.getInstance().savePatient(p);
        System.out.println("Successfully added paitent: " + p);
        return p;
    }


}
