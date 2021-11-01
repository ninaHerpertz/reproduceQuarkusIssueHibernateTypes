package Boundary;

import Entity.InterestRate;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/interests")
public class BasicRestEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/get")
    public List<InterestRate> getAllInterestRates(){
        return InterestRate.listAll();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/add")
    public void addInterestRate(InterestRate interestRate){
        InterestRate.persist(interestRate);
    }
}
