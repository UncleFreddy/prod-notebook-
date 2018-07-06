package products;

import java.util.Map;
import java.util.TreeMap;

public class Product {
    private String productGroup;
    private String productName;
    private Double productKkal;
    private ElementsMacro elementsMacro = new ElementsMacro();
    private ElementsMinerals elementsMinerals = new ElementsMinerals();
    private ElementsVitamins elementsVitamins = new ElementsVitamins();


    public TreeMap<String, Double> getAllElements() {
        TreeMap<String, Double> allElements = new TreeMap<String, Double>();
        allElements.putAll(getAllMacro());
        allElements.putAll(getAllMinerals());
        allElements.putAll(getAllVitamins());

        return  allElements;
    }
	public TreeMap<String, Double> getAllMacro() {
    	return getElementsMacro().getAllElementsMacro();
	}
	public TreeMap<String, Double> getAllMinerals() {
		return getElementsMinerals().getAllElementsMinerals();
	}
	public TreeMap<String, Double> getAllVitamins() {
		return getElementsVitamins().getAllElementsVitamins();
	}

	public ElementsMacro getElementsMacro() {
	    return elementsMacro;
	}

    public ElementsMinerals getElementsMinerals() {
        return elementsMinerals;
    }

    public ElementsVitamins getElementsVitamins() {
        return elementsVitamins;
    }

    public void setProductGroup(String productGroup) {
        this.productGroup = productGroup;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductKkal(Double productKkal) {
        this.productKkal = productKkal;
    }



    public String getProductGroup() {
        return productGroup;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductKkal() {
        return productKkal;
    }

    @Override
    public String toString() {
        return  productGroup +
                " {\n\t" + productName +
                " {\n\t\t" + productKkal +
                "\n\t" + elementsMacro.toString() +
                "\n\t" + elementsVitamins +
                "\n\t" + elementsMinerals +
                "\n}" +
                "}";
    }

    public void getElements(TreeMap<String, Double> elements) {

        for (Map.Entry<String, Double> pair : elements.entrySet()) {
            String key = pair.getKey();
            Double value = pair.getValue();
            if (key.equals("Белки, г")) {
                elementsMacro.setProtein(value);
            } else if (key.equals("Жиры, г")) {
                elementsMacro.setFat(value);
            } else if (key.equals("Углеводы, г")) {
                elementsMacro.setCarbohydrates(value);
            } else if (key.equals("Пищевые волокна, г")) {
                elementsMacro.setDietaryFiber(value);
            } else if (key.equals("Бор, мкг")) {
                elementsMinerals.setBor(value);
            } else if (key.equals("Ванадий, мкг")) {
                elementsMinerals.setVanadium(value);
            } else if (key.equals("Железо, мг")) {
                elementsMinerals.setFerrum(value);
            } else if (key.equals("Йод, мкг")) {
                elementsMinerals.setIodine(value);
            } else if (key.equals("Калий, мг")) {
                elementsMinerals.setKalium(value);
            } else if (key.equals("Кальций, мг")) {
                elementsMinerals.setCalcium(value);
            } else if (key.equals("Кобальт, мкг")) {
                elementsMinerals.setCobalt(value);
            } else if (key.equals("Кремний, мг")) {
                elementsMinerals.setSilicon(value);
            } else if (key.equals("Магний, мг")) {
                elementsMinerals.setMagnesium(value);
            } else if (key.equals("Марганец, мг")) {
                elementsMinerals.setMangnese(value);
            } else if (key.equals("Медь, мкг")) {
                elementsMinerals.setCopper(value);
            } else if (key.equals("Молибден, мкг")) {
                elementsMinerals.setMolybdenum(value);
            } else if (key.equals("Натрий, мг")) {
                elementsMinerals.setSodium(value);
            } else if (key.equals("Сера, мг")) {
                elementsMinerals.setSulphur(value);
            } else if (key.equals("Фосфор, мг")) {
                elementsMinerals.setPhosphorus(value);
            } else if (key.equals("Фтор, мкг")) {
                elementsMinerals.setFluorine(value);
            } else if (key.equals("Хлор, мг")) {
                elementsMinerals.setChlorine(value);
            } else if (key.equals("Хром, мкг")) {
                elementsMinerals.setChromium(value);
            } else if (key.equals("Цинк, мг")) {
                elementsMinerals.setZinc(value);
            } else if (key.equals("Селен, мкг")) {
                elementsVitamins.setSelenium(value);
            } else if (key.equals("Витамин A, мкг")) {
                elementsVitamins.setA(value);
            } else if (key.equals("Витамин B1 (тиамин), мг")) {
                elementsVitamins.setB1(value);
            } else if (key.equals("Витамин B2 (рибофлавин), мг")) {
                elementsVitamins.setB2(value);
            } else if (key.equals("Витамин B5 (пантотеновая), мг")) {
                elementsVitamins.setB5(value);
            } else if (key.equals("Витамин B6 (пиридоксин), мг")) {
                elementsVitamins.setB6(value);
            } else if (key.equals("Витамин B9 (фолиевая), мкг")) {
                elementsVitamins.setB9(value);
            } else if (key.equals("Витамин C, мг")) {
                elementsVitamins.setC(value);
            } else if (key.equals("Витамин E (ТЭ), мг")) {
                elementsVitamins.setE(value);
            } else if (key.equals("Витамин H (биотин), мкг")) {
                elementsVitamins.setH(value);
            } else if (key.equals("Витамин PP (ниациновый эквивалент), мг")) {
                elementsVitamins.setPP(value);
            } else if (key.equals("Витамин К (филлохинон), мкг")) {
                elementsVitamins.setK(value);
            } else if (key.equals("Холин, мг")) {
                elementsVitamins.setCholine(value);
            } else if (key.equals("Витамин D, мкг")) {
                elementsVitamins.setD(value);
            } else if (key.equals("Витамин B12 (кобаламины), мкг")) {
                elementsVitamins.setB12(value);
            } else if (key.equals("Бэта-каротин, мг")) {
                elementsVitamins.setBetaCarotene(value);
            }
        }
    }
}
