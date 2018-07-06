package products;

import java.util.TreeMap;

public class ElementsMacro {
    private Double carbohydrates;
    private Double protein;
    private Double fat;
    private Double dietaryFiber;

    @Override
    public String toString() {
        return "ElementsMacro {" +
                "\n\t carbohydrates: " + carbohydrates +
                "\n\t protein: " + protein +
                "\n\t fat: " + fat +
                "\n\t dietaryFiber: " + dietaryFiber +
                '}';
    }

    public Double getCarbohydrates() {
        if (carbohydrates == null) return 0.0;
        else return carbohydrates;
    }

    public Double getProtein() {
        if (protein == null) return 0.0;
        else return protein;
    }

    public Double getFat() {
        if (fat == null) return 0.0;
        else return fat;
    }

    public Double getDietaryFiber() {
        if (dietaryFiber == null) return 0.0;
        else return dietaryFiber;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setProtein(Double protein) {
        this.protein = protein;
    }

    public void setFat(Double fat) {
        this.fat = fat;
    }

    public void setDietaryFiber(Double dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public TreeMap<String, Double> getAllElementsMacro() {
    	TreeMap<String, Double> macro = new TreeMap<String, Double>();
    	macro.put("Белки, г", getProtein());
    	macro.put("Жиры, г", getFat());
    	macro.put("Углеводы, г", getCarbohydrates());
    	macro.put("Пищевые волокна, г", getDietaryFiber());

    	return macro;
    }
}
