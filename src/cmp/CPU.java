package cmp;

public class CPU {
    private final float freq;
    private final int coreCount;
    private final CPUManufacturer manufacturer;
    private final float CPUMass;

    public CPU(float freq, int coreCount, CPUManufacturer manufacturer, float CPUMass) {
        this.freq = freq;
        this.coreCount = coreCount;
        this.manufacturer = manufacturer;
        this.CPUMass = CPUMass;
    }

    public float getFreq() {
        return freq;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public CPUManufacturer getManufacturer() {
        return manufacturer;
    }

    public float getCPUMass() {
        return CPUMass;
    }

    @Override
    public String toString() {
        return "Центральный процессор (CPU):" +
                " тактовая тастота = " + freq + " ГГц" +
                ", кол-во ядер = " + coreCount +
                ", производитель: " + manufacturer +
                ", масса = " + CPUMass + " кг\n";
    }
}
