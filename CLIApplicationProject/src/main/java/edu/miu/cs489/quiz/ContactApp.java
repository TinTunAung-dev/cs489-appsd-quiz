package edu.miu.cs489.quiz;

import edu.miu.cs489.quiz.model.Contact;
import edu.miu.cs489.quiz.model.PhoneNumber;
import edu.miu.cs489.quiz.model.EmailAddress;
import java.util.*;
import com.google.gson.Gson;

public class ContactApp {
    public static void main(String[] args) {
        Contact c1 = new Contact("David", "Sanger", "Argos LCC", "Sales Manager");
        c1.addPhoneNumber("240-133-0011", "Home");
        c1.addPhoneNumber("240-112-0123", "Mobile");
        c1.addEmailAddress("dave.sang@gmail.com", "Home");
        c1.addEmailAddress("dsanger@argos.com", "Work");

        Contact c2 = new Contact("Carlos", "Jimenez", "Zappos", "Director");

        Contact c3 = new Contact("Ali", "Gafar", "BMI Services", "HR Manager");
        c3.addPhoneNumber("412-116-9988", "Work");
        c3.addEmailAddress("ali@bmi.com", "Work");

        List<Contact> contacts = new ArrayList<>();
        contacts.add(c1);
        contacts.add(c2);
        contacts.add(c3);

        contacts.sort(Comparator.comparing(Contact::getLastName));

        System.out.println("JSON format output: ");
        for (Contact contact : contacts) {
            System.out.println(new Gson().toJson(contact));
        }
    }
}
