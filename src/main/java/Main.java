import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Food;

public class Main {

    static ArrayList<Food> food = new ArrayList<>();

    // TO-DO create your array

    public static void main(String[] args) {


        // Adding new food items to the list
       food.add(new Food("Ramen", "Savory"));
       food.add(new Food("Hot wings", "Spicy"));
       food.add(new Food("Ice Cream", "Sweet"));
       food.add(new Food("Sour Gummies", "Sour"));

       // TO-DO add to your array
        
        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/food", foodHandler);

        // TO-DO create routes

    }

    public static Handler foodHandler = ctx -> {
        
        ctx.render("food.jte", Collections.singletonMap("food", food));

    };

    // TO-DO create handler


}
