package se.yrgo;

import java.util.*;

import se.yrgo.db.*;
import se.yrgo.classes.*;
import se.yrgo.util.*;

public class Main {
  public static void main(String[] args) {
    List<Person> persons;
    try {
      AddPeople.addPeopleAndSave();
    } finally {
      persons = Storage.fetchPersons();
      if (persons == null || persons.isEmpty()) {
        System.out.println("The list you wanted to fetch was empty...");
      } else {
        System.out.println(persons);
      }
    }
  }
}
