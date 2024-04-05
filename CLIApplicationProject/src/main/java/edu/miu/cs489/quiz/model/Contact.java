package edu.miu.cs489.quiz.model;

import java.util.ArrayList;
import java.util.List;
public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact() {
    }

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void addPhoneNumber(String number, String label) {
        phoneNumbers.add(new PhoneNumber(number, label));
    }

    public void addEmailAddress(String address, String label) {
        emailAddresses.add(new EmailAddress(address, label));
    }

    public void updateContactInfo(String newFirstName, String newLastName, String newCompany, String newJobTitle) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.company = newCompany;
        this.jobTitle = newJobTitle;
    }

    public void deleteContact() {
        phoneNumbers.clear();
        emailAddresses.clear();
    }
}
