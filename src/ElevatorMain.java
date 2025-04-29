import java.util.InputMismatchException;
import java.util.Scanner;

public class ElevatorMain {
    static boolean elevatorExists = false;

    public static void main(String[] args) {

        final String HELP = "up - 1 этаж вверх\n" +
                "down - 1 этаж вниз\n" +
                "move - перемещение на заданный этаж\n" +
                "where - текущий этаж\n" +
                "quit - выход";
        final String HELP_CMD = "help";
        final String ONE_UP_CMD = "up";
        final String ONE_DOWN_CMD = "down";
        final String MOVE_CMD = "move";
        final String WHERE_CMD = "where";
        final String QUIT_CMD = "quit";
        final String DEL_CMD = "delete";
        String menuCheck = "";

        while (!elevatorExists) {
            try {
                Elevator elevator1 = elevatorBuilder();
                while (!menuCheck.equals(QUIT_CMD)){
                    menuCheck = new Scanner(System.in).nextLine();
                    if (menuCheck.equals(HELP_CMD)){
                        System.out.println(HELP);
                    } else if (menuCheck.equals(ONE_UP_CMD)) {
                        elevator1.moveUp();
                    } else if (menuCheck.equals(ONE_DOWN_CMD)) {
                        elevator1.moveDown();
                    } else if (menuCheck.equals(MOVE_CMD)) {
                        elevator1.move(getTarget());
                    } else if (menuCheck.equals(WHERE_CMD)) {
                        System.out.println("Вы на " + elevator1.getCurrentFloor() + " этаже");
                    } else if (menuCheck.equals(QUIT_CMD)) {
                        System.out.println("До свидания!");
                    } else if (menuCheck.equals(DEL_CMD)) {
                        elevator1 = null;
                        elevatorExists = false;
                        System.out.println("Лифт Удален");
                        break;
                    } else {
                        System.out.println("Нет такой команды. help для списка команд");
                    }
                }//general menu while
            }catch (InputMismatchException ime){
                System.out.println("введенное не является целым числом. Лифт не создан");
            }catch (IllegalArgumentException iae){
                System.out.println("Проверьте этажность. Лифт не создан");
            } catch (NullPointerException npe) {
                System.out.println("Лифт не создан");;
            }
        }//Elevatorbuilder while


    }

    public static Elevator elevatorBuilder(){

        System.out.println("Введите максимальный этаж здания");
        int maxFloor = new Scanner(System.in).nextInt();
        System.out.println("Введите минимальный этаж здания");
        int minFloor = new Scanner(System.in).nextInt();
        Elevator elevator = new Elevator(maxFloor, minFloor);
        elevatorExists = true;

        return elevator;
    }

    public static int getTarget(){
        System.out.println("на какой этаж ехать?");
        return new Scanner(System.in).nextInt();
    }




}
