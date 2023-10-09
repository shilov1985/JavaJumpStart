

public class GoToWork {

    static boolean isHaveTmeForBreakfast = true;
    static boolean isMySonAwake = true;

    public static void main(String[] args) {

        System.out.println("Wake up");
        if(isHaveTmeForBreakfast){
            System.out.println("Breakfast");

        }
        System.out.println("Wake up my son...");
        if(isMySonAwake){
            System.out.println("My son is awake!");
            System.out.println("Lead my son to school.");
            System.out.println("Go to work.");
        }else{
            System.out.println("Try to wake up my son.");
        }


    }
}
