#### What happens if the designers of the Storage class decide to change the implementation of the List to LinkedList?

- _Think about the method calls in main - does trimToSize() exist in LinkedList?_
- _Should Main know about what concrete type of List Storage provides?_

**Answer** <br>
As you mentioned in the tip above. The method being used from List might not exist in the LinkedList class which will create complications, forcing you to rethink how to construct the whole program. You would have to rebuild the program depending on what LinkedList has for methods. <br>
It will also create complications for our Main class. Not knowing what the type is from the beginning will cause the developer to have to look back and find the superType which can take up time if the program has a lot of code. But using the List interface takes away all these complications because you can then specify whether the list is an Arraylist, LinkedList or any other implementaion of the List interface.

1. #### Make a UML diagram showing the inheritance tree (you don't need to be specific) <br>
   Open EmployeeDiagram.png or .jpeg to see diagram
2. #### Is it possible in this design for an Engineer to also become a Manager? \

   No. The engineer cannot also be a manager in this scenario. Since engineer already extends another class it is not possible to extend from two classes simultaneously. Singular inheritance is what prevents the double class extension.

3. #### Re-design the classes so that there is only one (concrete) class called Employee.

   - _Write a test program which confirms that you can create some employees with initial roles and that adding new roles work_

4. #### If you want a removeRole(Role) method, how do you have to change the Role class?
   _hint: to remove an object from a list, the list must be able to find the object, perhaps using equals_
