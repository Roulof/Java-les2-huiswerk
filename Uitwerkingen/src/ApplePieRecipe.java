import java.util.*;

public class ApplePieRecipe {

//Ingredientenlijst van het recept als velden binnen de klasse, lijst gemaakt door arraylist te gebruiken.

    private List<Ingredient> ingredients = new ArrayList<>();


    public ApplePieRecipe() {
        ingredients.add(new Ingredient("ongezouten roomboter", 200, "gram"));
        ingredients.add(new Ingredient("bakmeel", 400, "gram"));
        ingredients.add(new Ingredient("ei", 1, "stuk"));
        ingredients.add(new Ingredient("vanillesuiker", 8, "gram"));
        ingredients.add(new Ingredient("zout", 1, "snuf"));
        ingredients.add(new Ingredient("zoetzure appels", 1.5, "kilo"));
        ingredients.add(new Ingredient("kristalsuiker", 75, "gram"));
        ingredients.add(new Ingredient("kaneel", 3, "theelepels"));
        ingredients.add(new Ingredient("paneermeel", 15, "gram"));
    }

    // printen van de ingredients uit de arraylist
    public void printIngredients() {
        System.out.println("Ingrediënten:");
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }
    }


    public void printRecipeSteps() {
        System.out.println("\nStappen:");
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        System.out.println("3. Meng de boter, suiker, bakmeel, een helft van het ei, vanillesuiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem.");
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        System.out.println("7. Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        System.out.println("8. Rol het laatste deel van het deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        System.out.println("9. Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}





