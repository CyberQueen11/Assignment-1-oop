package se.yrgo;

import java.util.*;

import se.yrgo.db.*;
import se.yrgo.classes.*;
import se.yrgo.util.*;

public class Main {
  public static void main(String[] args) {
    Employee robot1 = new Employee("Josh", "Robotics", new Role("Manager"));
    System.out.println(robot1);

    robot1.addRole(new Role("Engineer"));

    System.out.println(robot1);

    robot1.removeRole(new Role("Engineer"));

    System.out.println(robot1);

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
