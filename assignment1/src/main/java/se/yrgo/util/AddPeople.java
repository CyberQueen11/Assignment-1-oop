package se.yrgo.util;

import java.util.*;

import se.yrgo.classes.*;
import se.yrgo.db.*;

public class AddPeople {

    private static List<Person> persons = new ArrayList<>();

    public static void addPeopleAndSave() {
        addPerson("Bob", "bob@email.com");
        addPerson("Ben", "ben@email.com");
        addPerson("Pam", "pam@email.com");
        addPerson("Eve", "eve@email.com");
        addPerson("Guy", "guy@email.com");
        addPerson("Lis", "lis@email.com");
        addPerson("Ann", "ann@email.com");
        Storage.save(persons);
    }

    public static void addPerson(String name, String email) {
        persons.add(new Person(name, email));
    }
}
