package pl.mountainrinji;

import pl.mountainrinji.db.CTQuery;
import pl.mountainrinji.db.OneValueQueryContainer;
import pl.mountainrinji.db.OneValueQueryMethod;

@OneValueQueryContainer
public class UserService {

    public User getDefaultUser() {
        User user = new User();
        user.setFirstName("JonFromREST");
        user.setLastName("DoeFromREST");
        return user;
    }
    
    @OneValueQueryMethod(queryName = "GET_USERNAME")
    public String getDefaultUserName() {
        return "userName";
    }
    
    public String getDefaultUserAge() {
        return "20";
    }
}