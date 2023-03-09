package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_016_Pojo {
    /**
     {
         "createdBy": "adminteam01",
         "firstName": "ShiningPatient3",
         "lastName": "Team",
         "phone": "5555555545",
         "user": {
             "login": "system",
             "activated": true,
             "ssn": "856-45-6788"
         }
         }
     */

    private String createdBy;
    private String firstName;
    private String lastName;
    private String phone;
    private US_016_UserPojo user;

    public US_016_Pojo(String createdBy, String firstName, String lastName, String phone, US_016_UserPojo user) {
        this.createdBy = createdBy;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.user = user;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public US_016_UserPojo getUser() {
        return user;
    }

    public void setUser(US_016_UserPojo user) {
        this.user = user;
    }

    public US_016_Pojo() {
    }

    @Override
    public String toString() {
        return "US_016_Pojo{" +
                "createdBy='" + createdBy + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                '}';
    }
}
