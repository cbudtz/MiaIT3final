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
    public Patient getPatient(@PathParam())
    }


