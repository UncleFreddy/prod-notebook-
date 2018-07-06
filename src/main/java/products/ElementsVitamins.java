package products;

import java.util.TreeMap;

public class ElementsVitamins {
    private Double selenium;
    private Double a;
    private Double b1;
    private Double b2;
    private Double b5;
    private Double b6;
    private Double b9;
    private Double c;
    private Double e;
    private Double h;
    private Double PP;
    private Double k;
    private Double choline;
    private Double d;
    private Double b12;
    private Double betaCarotene;

    @Override
    public String toString() {
        return "ElementsVitamins {" +
                "\n\t selenium: " + selenium +
                "\n\t a: " + a +
                "\n\t b1: " + b1 +
                "\n\t b2: " + b2 +
                "\n\t b5: " + b5 +
                "\n\t b6: " + b6 +
                "\n\t b9: " + b9 +
                "\n\t c: " + c +
                "\n\t e: " + e +
                "\n\t h: " + h +
                "\n\t PP: " + PP +
                "\n\t k: " + k +
                "\n\t choline: " + choline +
                "\n\t d: " + d +
                "\n\t b12: " + b12 +
                "\n\t betaCarotene: " + betaCarotene +
                '}';
    }

	public TreeMap<String, Double> getAllElementsVitamins() {
		TreeMap<String, Double> vitamins = new TreeMap<String, Double>();
		vitamins.put("Витамин A, мкг", getA());
		vitamins.put("Витамин B1 (тиамин), мг", getB1());
		vitamins.put("Витамин B2 (рибофлавин), мг", getB2());
		vitamins.put("Витамин B5 (пантотеновая), мг", getB5());
		vitamins.put("Витамин B6 (пиридоксин), мг", getB6());
		vitamins.put("Витамин B9 (фолиевая), мкг", getB9());
		vitamins.put("Витамин C, мг", getC());
		vitamins.put("Витамин E (ТЭ), мг", getE());
		vitamins.put("Витамин H (биотин), мкг", getH());
		vitamins.put("Витамин PP (ниациновый эквивалент), мг", getPP());
		vitamins.put("Витамин К (филлохинон), мкг", getK());
		vitamins.put("Холин, мг", getCholine());
		vitamins.put("Витамин D, мкг", getD());
		vitamins.put("Витамин B12 (кобаламины), мкг", getB12());
		vitamins.put("Бэта-каротин, мг", getBetaCarotene());

		return vitamins;
	}

    public Double getSelenium() {
        if (selenium == null) return 0.0;
        else return selenium;
    }

    public Double getA() {
        if (a == null) return 0.0;
        else return a;
    }

    public Double getB1() {
        if (b1 == null) return 0.0;
        else return b1;
    }

    public Double getB2() {
        if (b2 == null) return 0.0;
        else return b2;
    }

    public Double getB5() {
        if (b5 == null) return 0.0;
        else return b5;
    }

    public Double getB6() {
        if (b6 == null) return 0.0;
        else return b6;
    }

    public Double getB9() {
        if (b9 == null) return 0.0;
        else return b9;
    }

    public Double getC() {
        if (c == null) return 0.0;
        else return c;
    }

    public Double getE() {
        if (e == null) return 0.0;
        else return e;
    }

    public Double getH() {
        if (h == null) return 0.0;
        else return h;
    }

    public Double getPP() {
        if (PP == null) return 0.0;
        else return PP;
    }

    public Double getK() {
        if (k == null) return 0.0;
        else return k;
    }

    public Double getCholine() {
        if (choline == null) return 0.0;
        else return choline;
    }

    public Double getD() {
        if (d == null) return 0.0;
        else return d;
    }

    public Double getB12() {
        if (b12 == null) return 0.0;
        else return b12;
    }

    public Double getBetaCarotene() {
        if (betaCarotene == null) return 0.0;
        else return betaCarotene;
    }

    public void setSelenium(Double selenium) {
        this.selenium = selenium;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public void setB1(Double b1) {
        this.b1 = b1;
    }

    public void setB2(Double b2) {
        this.b2 = b2;
    }

    public void setB5(Double b5) {
        this.b5 = b5;
    }

    public void setB6(Double b6) {
        this.b6 = b6;
    }

    public void setB9(Double b9) {
        this.b9 = b9;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public void setE(Double e) {
        this.e = e;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public void setPP(Double pp) {
        this.PP = pp;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public void setCholine(Double choline) {
        this.choline = choline;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public void setB12(Double b12) {
        this.b12 = b12;
    }

    public void setBetaCarotene(Double betaCarotene) {
        this.betaCarotene = betaCarotene;
    }
}
