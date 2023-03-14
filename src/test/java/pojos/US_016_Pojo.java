package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class US_016_Pojo {
    /**
     {
         "createdBy": "system",
         "firstName": "Hank",
         "lastName": "MacGyver",
         "phone": "3443447575",
        "email": "keith.bruen@yahoo.com",
         "user": {
             "login": "system",
             "activated": true,
             "ssn": "856-45-6788"
         }
         }
     */


    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private US_016_UserPojo user;

    public US_016_Pojo(String firstName, String lastName, String phone, String email, US_016_UserPojo user) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.user = user;
        this.email= email;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String phone) {
        this.email = email;
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

                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                '}';
    }
}
