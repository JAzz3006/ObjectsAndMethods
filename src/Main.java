import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dimensions dim1 = new Dimensions(0.25f, 0.3f, 0.15f);
        Package pack1 = new Package(23.3f, "Praha, Biskupsky dvur, 10", false, "qweasd123$", true, dim1);

        System.out.println(pack1);
        System.out.println(pack1.changeAddress("Екатеринбург, Радищева, 31"));
        System.out.println(pack1.changeMass(25.6f));
        System.out.println(pack1.changeMass(25.6f).changeAddress("Екатеринбург, Радищева, 31"));
        System.out.println(pack1.changeDimensions(new Dimensions(0.7f, 0.48f, 0.24f)));

    }

}
