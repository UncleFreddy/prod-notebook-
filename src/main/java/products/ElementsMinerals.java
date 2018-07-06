package products;

import java.util.TreeMap;

public class ElementsMinerals {
    private Double zinc;
    private Double chromium;
    private Double bor;
    private Double vanadium;
    private Double ferrum;
    private Double iodine;
    private Double kalium;
    private Double calcium;
    private Double cobalt;
    private Double silicon;
    private Double magnesium;
    private Double mangnese;
    private Double copper;
    private Double molybdenum;
    private Double sodium;
    private Double sulphur;
    private Double phosphorus;
    private Double fluorine;
    private Double chlorine;

    @Override
    public String toString() {
        return "ElementsMinerals {" +
                "\n\t zinc: " + zinc +
                "\n\t chromium: " + chromium +
                "\n\t bor: " + bor +
                "\n\t vanadium: " + vanadium +
                "\n\t ferrum: " + ferrum +
                "\n\t iodine: " + iodine +
                "\n\t kalium: " + kalium +
                "\n\t calcium: " + calcium +
                "\n\t cobalt: " + cobalt +
                "\n\t silicon: " + silicon +
                "\n\t magnesium: " + magnesium +
                "\n\t mangnese: " + mangnese +
                "\n\t copper: " + copper +
                "\n\t molybdenum: " + molybdenum +
                "\n\t sodium: " + sodium +
                "\n\t sulphur: " + sulphur +
                "\n\t phosphorus: " + phosphorus +
                "\n\t fluorine: " + fluorine +
                "\n\t chlorine: " + chlorine +
                '}';
    }

	public TreeMap<String, Double> getAllElementsMinerals() {
		TreeMap<String, Double> minerals = new TreeMap<String, Double>();
		minerals.put("Бор, мкг", getBor());
		minerals.put("Ванадий, мкг", getVanadium());
		minerals.put("Железо, мг", getFerrum());
		minerals.put("Йод, мкг", getIodine());
		minerals.put("Калий, мг", getKalium());
		minerals.put("Кальций, мг", getCalcium());
		minerals.put("Кобальт, мкг", getCobalt());
		minerals.put("Кремний, мг", getSilicon());
		minerals.put("Магний, мг", getMagnesium());
		minerals.put("Марганец, мг", getMangnese());
		minerals.put("Медь, мкг", getCopper());
		minerals.put("Молибден, мкг", getMolybdenum());
		minerals.put("Натрий, мг", getSodium());
		minerals.put("Сера, мг", getSulphur());
		minerals.put("Фосфор, мг", getPhosphorus());
		minerals.put("Фтор, мкг", getFluorine());
		minerals.put("Хлор, мг", getChlorine());
		minerals.put("Хром, мкг", getChromium());
		minerals.put("Цинк, мг", getZinc());

		return minerals;
	}

    public Double getZinc() {
        if (zinc == null) return 0.0;
        else return zinc;
    }

    public Double getChromium() {
        if (chromium == null) return 0.0;
        else return chromium;
    }

    public Double getBor() {
        if (bor == null) return 0.0;
        else return bor;
    }

    public Double getVanadium() {
        if (vanadium == null) return 0.0;
        else return vanadium;
    }

    public Double getFerrum() {
        if (ferrum == null) return 0.0;
        else return ferrum;
    }

    public Double getIodine() {
        if (iodine == null) return 0.0;
        else return iodine;
    }

    public Double getKalium() {
        if (kalium == null) return 0.0;
        else return kalium;
    }

    public Double getCalcium() {
        if (calcium == null) return 0.0;
        else return calcium;
    }

    public Double getCobalt() {
        if (cobalt == null) return 0.0;
        else return cobalt;
    }

    public Double getSilicon() {
        if (silicon == null) return 0.0;
        else return silicon;
    }

    public Double getMagnesium() {
        if (magnesium == null) return 0.0;
        else return magnesium;
    }

    public Double getMangnese() {
        if (mangnese == null) return 0.0;
        else return mangnese;
    }

    public Double getCopper() {
        if (copper == null) return 0.0;
        else return copper;
    }

    public Double getMolybdenum() {
        if (molybdenum == null) return 0.0;
        else return molybdenum;
    }

    public Double getSodium() {
        if (sodium == null) return 0.0;
        else return sodium;
    }

    public Double getSulphur() {
        if (sulphur == null) return 0.0;
        else return sulphur;
    }

    public Double getPhosphorus() {
        if (phosphorus == null) return 0.0;
        else return phosphorus;
    }

    public Double getFluorine() {
        if (fluorine == null) return 0.0;
        else return fluorine;
    }

    public Double getChlorine() {
        if (chlorine == null) return 0.0;
        else return chlorine;
    }


    public void setChromium(Double chromium) {
        this.chromium = chromium;
    }

    public void setBor(Double bor) {
        this.bor = bor;
    }

    public void setVanadium(Double vanadium) {
        this.vanadium = vanadium;
    }

    public void setFerrum(Double ferrum) {
        this.ferrum = ferrum;
    }

    public void setIodine(Double iodine) {
        this.iodine = iodine;
    }

    public void setKalium(Double kalium) {
        this.kalium = kalium;
    }

    public void setCalcium(Double calcium) {
        this.calcium = calcium;
    }

    public void setCobalt(Double cobalt) {
        this.cobalt = cobalt;
    }

    public void setSilicon(Double silicon) {
        this.silicon = silicon;
    }

    public void setMagnesium(Double magnesium) {
        this.magnesium = magnesium;
    }

    public void setMangnese(Double mangnese) {
        this.mangnese = mangnese;
    }

    public void setCopper(Double copper) {
        this.copper = copper;
    }

    public void setMolybdenum(Double molybdenum) {
        this.molybdenum = molybdenum;
    }

    public void setSodium(Double sodium) {
        this.sodium = sodium;
    }

    public void setSulphur(Double sulphur) {
        this.sulphur = sulphur;
    }

    public void setPhosphorus(Double phosphorus) {
        this.phosphorus = phosphorus;
    }

    public void setFluorine(Double fluorine) {
        this.fluorine = fluorine;
    }

    public void setChlorine(Double chlorine) {
        this.chlorine = chlorine;
    }

    public void setZinc(Double zinc) {
        this.zinc = zinc;
    }
}
