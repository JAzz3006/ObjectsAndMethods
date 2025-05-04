import cmp.*;

import java.util.Objects;
import java.util.Optional;

public class Computer {
  private CPU cpu;
  private RAM ram;
  private Drive drive;
  private Display display;
  private Keyboard keyboard;
  private final String compName;
  private final String compVendor;
  private float compWeight = 0;
  public static final float EMPTY_COMP_MASS = 2.3f;


    public Computer(String compName, String compVendor) {
        this.compName = compName;
        this.compVendor = compVendor;
        compWeight = EMPTY_COMP_MASS;
    }

    public Optional<CPU> getOptionalCpu() {
        return Optional.ofNullable(cpu);
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
    public float compMassCalc(){

        float cpuWeight = getOptionalCpu().orElse(new CPU(0,0,CPUManufacturer.Intel,0)).getCPUMass();

        //cpuWeight;
//        if (cpu != null){cpuWeight = cpu.getCPUMass();}else {
//            cpuWeight = 0;
//        }
        float ramWeight;
        if (ram != null){ramWeight = ram.getRAMMass();}else {
            ramWeight = 0;
        }
        float driveWeight;
        if (drive != null){driveWeight = drive.getDriveMass();}else{
            driveWeight = 0;
        }
        float displayWeight;
        if (display != null){displayWeight = display.getDisplayMass();}else{
            displayWeight = 0;
        }
        float keyBoardWeight;
        if (keyboard != null){keyBoardWeight = keyboard.getKeyboardMass();}else{
            keyBoardWeight = 0;
        }
        return compWeight = compWeight +
                cpuWeight +
                ramWeight +
                driveWeight +
                displayWeight +
                keyBoardWeight;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getCompName() {
        return compName;
    }

    public String getCompVendor() {
        return compVendor;
    }

    @Override
    public String toString() {
        return " - Компьютер " + compName + " производства " + compVendor +" -\n"
                + Objects.toString(cpu, "[процессор не выбран]\n")
                + Objects.toString(ram,"[память не выбрана]\n")
                + Objects.toString( drive, "[диск не выбран]\n")
                + Objects.toString(display,"[дисплей не выбран]\n")
                + Objects.toString(keyboard, "[клавиатура не выбрана]\n");
    }
}
