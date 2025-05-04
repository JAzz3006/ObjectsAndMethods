import cmp.*;

public class CompMain {
    public static void main(String[] args) {

        Computer comp1 = new Computer("Луноход-1", "Кац и сыновья");
        comp1.setCpu(new CPU(4.4f,4,CPUManufacturer.AMD,0.3f));
        comp1.setRam(new RAM(RAMType.DDR5_SDRAM, 200f, 0.1f));
        comp1.setDrive(new Drive(DriveType.SDD, 800f, 0.3f));
        comp1.setDisplay(new Display(DisplayType.TA, 19.0f, 2.2f));
        comp1.setKeyboard(new Keyboard(KeyboardType.ERGONOMIC, KeyboardLights.NO, 0.15f) );
        System.out.println(comp1.toString());
        System.out.println(String.format("%.2f",comp1.compMassCalc()) + " кг - масса");

        Computer comp2 = new Computer("Primus", "Schwatzman & Co");
        comp2.setCpu(new CPU(6.5f, 4, CPUManufacturer.Intel, 0.2f));
        comp2.setRam(new RAM(RAMType.DDR1_SDRAM, 250f, 0.09f ));
        comp2.setDrive(new Drive(DriveType.SDD, 750f, 0.25f));
        System.out.println(comp2.toString());
        System.out.println(String.format("%.2f",comp2.compMassCalc()) + " кг - масса");





    }
}
