public class Elevator {
    private int currentFloor;
    private int maxFloor;
    private int minFloor;

    public Elevator(int maxFloor, int minFloor){
        this.currentFloor = 1;
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
        if (currentFloor < minFloor || currentFloor > maxFloor){
            throw new IllegalArgumentException("Ошибочно заданы минимальный и максимальный этажи");
        }else {
            System.out.println("Установлен лифт. Ходит с " + minFloor + " до " + maxFloor + " этажа");
        }

    }
    public int getCurrentFloor(){
        return currentFloor;
    }

    public void moveUp(){
        if ((currentFloor + 1) <= maxFloor){
            currentFloor = currentFloor + 1;
            System.out.println(currentFloor);
        }else {
            System.out.println("Вы на максимальном этаже");
        }
    }

    public void moveDown(){
        if ((currentFloor -1) >= minFloor){
            currentFloor--;
            System.out.println(currentFloor);
        }else {
            System.out.println("Вы на нижнем этаже");
        }
    }

    public void move(int target){
        if (target == currentFloor){
            System.out.println("Вы итак на " + currentFloor + " этаже");
        } else if (target > maxFloor) {
            System.out.println("Такого этажа нет, максимальный этаж = " + maxFloor);
        } else if (target < minFloor) {
            System.out.println("Нет такого этажа, минимальный этаж = " + minFloor);
        } else if (target <= maxFloor && target > currentFloor){
            while (currentFloor != target){
                currentFloor++;
                String result = (currentFloor == target) ?
                        Integer.toString(currentFloor) + " - приехали!" : Integer.toString(currentFloor);//реализация с тернарным оператором
                System.out.println(result);
            }
        } else if (target >= minFloor && target < currentFloor ) {
            while(currentFloor != target){
                currentFloor--;
                if (currentFloor == target){//реализация с простым if-else
                    System.out.println(currentFloor + " - приехали!");
                }else {
                    System.out.println(currentFloor);
                }

            }
        }
    }








}
