package cmp;

public class RAM {

    private final RAMType RAMType;
    private final float RAMVolume;
    private final float RAMMass;

    public RAM(cmp.RAMType RAMType, float RAMVolume, float RAMMass) {
        this.RAMType = RAMType;
        this.RAMVolume = RAMVolume;
        this.RAMMass = RAMMass;
    }

    public cmp.RAMType getRAMType() {
        return RAMType;
    }

    public float getRAMVolume() {
        return RAMVolume;
    }

    public float getRAMMass() {
        return RAMMass;
    }

    @Override
    public String toString() {
        return "Память: " +
                "тип: " + RAMType +
                ", объем = " + RAMVolume + " Гб" +
                ", масса = " + RAMMass + "кг\n";
    }
}
