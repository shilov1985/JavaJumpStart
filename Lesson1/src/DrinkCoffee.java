

public class DrinkCoffee {
    static boolean isIamLateForWork = true;
    static boolean isCoffeeMashineReady = false;
    static Coffee coffee;

    public static void main(String[] args) {


        MySelf.wakeUp();

        MySelf.powerOnCofeeMashine();

        if (CoffeeMashine.isReady()) {

            coffee = new Coffee();
            coffee.addSugar();

            if (MySelf.isIamLateForWork()) {
                MySelf.goToWork();
            } else {
                MySelf.drinkCofee();
                MySelf.goToWork();
            }

        } else {
            CoffeeMashine.makeCoffee();

        }

    }

    public static class CoffeeMashine {

        public static void powerOn() {
            System.out.println("Coffee mashine is power ON.");

        }

        public static void makeCoffee() {
            System.out.println("Waiting for the coffee to be ready");

        }

        public static boolean isReady() {
            return isCoffeeMashineReady;
        }

    }

    public static class MySelf {

        public static void wakeUp() {
            System.out.println("I am awake.");

        }

        public static void drinkCofee() {
            System.out.println("Drink coffee.");

        }

        public static boolean isIamLateForWork() {
            if (isIamLateForWork) {
                System.out.println("I am late snd must go to work.");
                return true;
            } else {
                System.out.println("I am NOT late for work.");
                return false;
            }

        }

        public static void goToWork() {
            System.out.println("Goto work.");

        }

        public static void powerOnCofeeMashine() {
            CoffeeMashine.powerOn();
        }

    }

    public static class Coffee {

        public Coffee() {
            System.out.println("Coffee is ready.");
        }

        public void addSugar() {
            System.out.println("Add sugar");

        }

    }
}
