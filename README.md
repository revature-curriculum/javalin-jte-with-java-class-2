## JTE with Java Classes 3: Adding if Statements
---
### Description
In this lab we will cover how to iterate through an ArrayList of Java Objects using JTE while using an if statement to further filter the text shown. See the food implementation for reference.

---
### Steps


1. In src -> main -> java -> objects -> SeaCreature.java add at least two fields. One should be the name of the animal, and another the size of the animal. You can add more if you want.
2. Create a constructor for the class.
3. Create getters for all the fields. These getters should be public so other files can access them.
4. In src -> main -> java -> Main.java, create an ArrayList of SeaCreature objects. This arraylist should be static and be created outside the main method.
5. Add at least 4 SeaCreature objects to your list. This should be done in the main method. See the ShoppingItems reference example in the same file.
6. Create a handler that will render seaCreatures.jte and send it your list of SeaCreature objects.
7. Create a route for the handler.
8. In src -> main -> jte -> seaCreatures.jte add the required imports and parameters.
    * Remember to import java.util.* for the arraylist.
    * Remember to use the same name for the parameter and the key for the singletonMap.
9. Create a for loop inside the body tags. This for loop should iterate through all the sea creatures.
10. In the for loop add an if statement that checks the size of the sea creature. Display different text based on the size and filters through the if statement.
    * You can look at the lesson example or the food.jte file for reference.

---
### Sample Output
* Blue Whales are so very large!
* Starfish are tiny!
* Anglerfish are tiny!
* Bottlenose Dolphins are quite big!
---
