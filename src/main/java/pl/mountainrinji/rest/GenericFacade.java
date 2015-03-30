package pl.mountainrinji.rest;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.mountainrinji.db.AnnotateDrivenDAO;
import pl.mountainrinji.db.CTQuery;
import pl.mountainrinji.db.HibernateUtil;
import pl.mountainrinji.facade.base.OneValue;
import pl.mountainrinji.facade.base.QueryParams;
import pl.mountainrinji.spring.ApplicationContextProvider;

@Path("/genericFacade")
public class GenericFacade {
	
	private AnnotateDrivenDAO annotateDrivenDAO = null;
	
	
    @POST
    @Path("/getOneValue")
    @Produces(MediaType.APPLICATION_JSON)
    public OneValue getOneValue(QueryParams queryParams) {
        OneValue result;
    	try {
			result = new OneValue(getAnnotateDrivenDAO().executeOneValueQuery(CTQuery.valueOf(queryParams.getQueryName())));
		} catch (Exception ex) {
			result = new OneValue(ex.getMessage());
		}
       
        return result;
    }
    
    @POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/newBulletin")
	public Response newBulletin(Bulletin bulletin) {
		bulletin.name = "name";
		return null;
	}
    
    @POST
   	@Consumes(MediaType.APPLICATION_JSON)
   	@Path("/car")
   	public Response car(Car car) {
   		car.name = "name";
   		return null;
   	}

    
    private AnnotateDrivenDAO getAnnotateDrivenDAO() {
    	if (annotateDrivenDAO == null) {
    		annotateDrivenDAO = ApplicationContextProvider.getApplicationContext().getBean(AnnotateDrivenDAO.class);
    	}
    	return annotateDrivenDAO;
    }
    
}
