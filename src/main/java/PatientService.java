import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("patients")
public class PatientService {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
        public List<Patient> getPatients() {
            return PatientDao.getInstance().getPatients();
    }

    @GET
    @Path("{cpr}")
    public Patient getPatient(@PathParam("cpr") String cpr) {

        return null;
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Patient postPatient(Patient p) {
        PatientDao.getInstance().getPatients().add(p);
        return p;

    }
}


