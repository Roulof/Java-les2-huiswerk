//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Nieuw recept maken voor Appeltaart
        ApplePieRecipe recipe = new ApplePieRecipe();

        //Printen van Ingredienten en bereidingswijze van het recept door hun respectievelijke methodes.
        recipe.printIngredients();
        recipe.printRecipeSteps();

        }
    }
