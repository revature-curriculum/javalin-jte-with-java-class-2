package objects;

public class Food {
    
    String name;
    String type;

    public Food(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

}
