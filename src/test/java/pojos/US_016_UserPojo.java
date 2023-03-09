package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US_016_UserPojo {
    /**
     {
         "user": {
             "login": "system",
             "activated": true,
             "ssn": "856-45-6788"
         }
  }
     */
    private String login;
    private Boolean activated;
    private String ssn;

    public US_016_UserPojo(String login, Boolean activated, String ssn) {
        this.login = login;
        this.activated = activated;
        this.ssn = ssn;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public US_016_UserPojo() {
    }

    @Override
    public String toString() {
        return "US_016_UserPojo{" +
                "login='" + login + '\'' +
                ", activated=" + activated +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
