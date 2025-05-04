package cmp;

public class Display {
    private final DisplayType displayType;
    private final float displaySize;
    private final float displayMass;


    public Display(DisplayType displayType, float displaySize, float displayMass) {
        this.displayType = displayType;
        this.displaySize = displaySize;
        this.displayMass = displayMass;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public float getDisplaySize() {
        return displaySize;
    }

    public float getDisplayMass() {
        return displayMass;
    }
   
    @Override
    public String toString() {
        return "Монитор: "
                +"тип: " + displayType +
                ", размер = " + displaySize + "''" +
                ", масса = " + displayMass + " кг\n";

    }
}
