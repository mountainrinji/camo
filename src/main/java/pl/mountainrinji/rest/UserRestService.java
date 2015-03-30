package pl.mountainrinji.rest;

import java.lang.reflect.InvocationTargetException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;

import pl.mountainrinji.User;
import pl.mountainrinji.UserService;
import pl.mountainrinji.db.AnnotateDrivenDAO;
import pl.mountainrinji.db.CTQuery;
import pl.mountainrinji.facade.base.OneValue;
import pl.mountainrinji.spring.ApplicationContextProvider;


@Path("/users")
public class UserRestService {

    @GET
    @Path("/getName")
    @Produces(MediaType.APPLICATION_JSON)
    public OneValue getName() {
        UserService userService = new UserService();
        String username=userService.getDefaultUserName();
        AnnotateDrivenDAO dao = ApplicationContextProvider.getApplicationContext().getBean(AnnotateDrivenDAO.class);
        Object defaultUserName;
        try {
			defaultUserName = dao.executeOneValueQuery(CTQuery.GET_USERNAME);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new OneValue(username);
    }
    
    @GET
    @Path("/getAge")
    @Produces(MediaType.TEXT_PLAIN)
    public String getAge() {
        UserService userService = new UserService();
        return userService.getDefaultUserAge();
    }
}
