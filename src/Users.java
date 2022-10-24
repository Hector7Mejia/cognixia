import java.io.Serializable;

public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    private String  uName;
    private String  email;
    private String designation;
    private String location;
//    private String city;

    private String getuName() {
        return uName;
    }
    public void setuName(String uName) {
        this.uName = uName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public Users(String uName, String email, String designation, String location) {
        super();
        this.uName = uName;
        this.email = email;
        this.designation = designation;
        this.location = location;
    }
    public Users() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Users [uName=" + uName + ", email=" + email + ", designation=" + designation + ", location=" + location
                + "]";
    }

}

