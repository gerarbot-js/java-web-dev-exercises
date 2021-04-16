package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName() {
        return firstName;
    }

    void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public String getSubject() {
        return subject;
    }

    void setSubject(String aSubject) { this.subject = aSubject; }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }
}
