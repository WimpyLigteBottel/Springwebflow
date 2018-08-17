package nel.marco.controller.model;

import java.io.Serializable;

public class UserDetail implements Serializable {

    private static final long serialVersionUID = 1861178405860818325L;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
