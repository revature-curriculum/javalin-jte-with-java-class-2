@import objects.Food
@import java.util.*
@param ArrayList<Food> food


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <p>Hello!</p>

    @for(Food foodItem : food)
    <li>
        This food is ${foodItem.getName()}!
        @if(foodItem.getType().equals("Savory"))
            My stomach is full!
        @elseif(foodItem.getType().equals("Sweet"))
            Maybe I can have one more bite!
        @elseif(foodItem.getType().equals("Sour"))
            My face is puckered up!
        @else
            My mouth is burning!
        @endif
    </li>
    @endfor


    <a href="/">Back</a>

</body>
</html>