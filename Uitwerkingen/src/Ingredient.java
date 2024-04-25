public class Ingredient {

    // Maken van variabelen met hierbij de bijbehorende klassen
private String name;
private double amount;
private String unit;

// Constructor met de gemaakte variabelen als parameters
public Ingredient (String name, double amount, String unit)
{
    this.name = name;
    this.amount = amount;
    this.unit = unit;
}


// Getters en setters om de waardes uit de parameters te laten ophalen.

    public String getName() {
        return name;
}
    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
    return amount;
    }

    public void setAmount(double amount) {
    this.amount = amount;
    }

    public String getUnit() {
    return unit;
    }

    public void setUnit(String unit) {
    this.unit = unit;
    }
}
