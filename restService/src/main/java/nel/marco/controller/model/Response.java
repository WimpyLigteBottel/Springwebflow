package nel.marco.controller.model;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = 6329419172787928092L;

    private boolean validUsername;
    private boolean validPassword;
    private String message;

    public Response() {
        this.message = "";
    }

    public boolean isValidUsername() {
        return validUsername;
    }

    public void setValidUsername(boolean validUsername) {
        this.validUsername = validUsername;
    }

    public boolean isValidPassword() {
        return validPassword;
    }

    public void setValidPassword(boolean validPassword) {
        this.validPassword = validPassword;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
