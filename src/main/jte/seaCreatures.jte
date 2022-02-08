@import objects.SeaCreature
@import java.util.*
@param ArrayList<SeaCreature> seaCreatures


<html lang="en">

<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/water.css@2/out/light.min.css">
</head>
<body>

    <p>Hello!</p>

    @for(SeaCreature seaCreature : seaCreatures)
    <li>
        This food is ${seaCreature.getName()}! They are normally ${seaCreature.getColor()} in color.
        @if(seaCreature.getSize() > 15)
            They are so very large!
        @elseif(seaCreature.getSize() < 2)
            They are tiny!
        @elseif(seaCreature.getSize() > 6)
            They are quite big!
        @else
            About the size of a human.
        @endif
    </li>
    @endfor


    <a href="/">Back</a>

</body>
</html>