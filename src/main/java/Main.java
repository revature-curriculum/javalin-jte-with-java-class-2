import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Food;
import objects.SeaCreature;

public class Main {

    static ArrayList<Food> food = new ArrayList<>();

    static ArrayList<SeaCreature> seaCreatures = new ArrayList<>();

    public static void main(String[] args) {


      // Adding new food items to the list
      food.add(new Food("Ramen", "Savory"));
      food.add(new Food("Hot wings", "Spicy"));
      food.add(new Food("Ice Cream", "Sweet"));
      food.add(new Food("Sour Gummies", "Sour"));

      seaCreatures.add(new SeaCreature("Blobfish", 16, "pink"));
      seaCreatures.add(new SeaCreature("Sea Angel", 1, "green-cyan"));
      seaCreatures.add(new SeaCreature("Peacock Mantis Shrimp", 1, "orange"));
      seaCreatures.add(new SeaCreature("Firefly Squid", 7, "brownish-red"));
      
      Javalin app = Javalin.create().start(4100);

      app.get("/", ctx -> ctx.render("index.jte"));

      app.get("/food", foodHandler);

      app.get("/seaCreatures", scHandler);

    }

    public static Handler foodHandler = ctx -> {
        
      ctx.render("food.jte", Collections.singletonMap("food", food));

    };

    public static Handler scHandler = ctx -> {
      ctx.render("seaCreatures.jte", Collections.singletonMap("seaCreatures", seaCreatures));
    };


}
