## Javalin JTE with Java Class 2
---
### Description
In this lab we will cover how to iterate through an ArrayList of Java Objects using JTE while using an if statement to further filter the text shown. See the food implementation for reference.

---
### Steps

1. In src -> main -> java -> objects, add your fields and getters to your SeaCreature.java file. Make sure to have at least 3 fields in this file, including size.
2. Create methods in this new class that return size and name of the creature
2. In src -> main -> java -> Main.java, create an ArrayList of SeaCreature objects. Add at least 4 SeaCreature objects to your list.
3. In the same file, create a new route and handler for your list of SeaCreature objects.
4. In src -> main -> jte, add your implementation in the seaCreature.jte file where you will iterate through your list with a for loop. Make sure to add the imports and parameters required. Add your for loop inside the body tag.
5. In the for loop add if statements to check the size of the sea creature. Display different text based on the size and filters through the if statement.


---
### Sample Output
* Blue Whales are so very large!
* Starfish are tiny!
* Anglerfish are tiny!
* Bottlenose Dolphins are quite big!
---
