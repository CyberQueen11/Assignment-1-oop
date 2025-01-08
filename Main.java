import java.util.*;

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
