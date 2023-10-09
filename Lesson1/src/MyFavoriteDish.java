

public class MyFavoriteDish {


    private static boolean isPotatoesClean = true;
    private static boolean isDishBaked = false;

    public static void main(String[] args) {
        System.out.println("Peel potatoes");
        System.out.println("Wash the potatoes");
        if(isPotatoesClean){

            System.out.println("Slice the potatoes");
            System.out.println("Put sliced potatoes in the tray");
            System.out.println("Add the minced meat in the tray");
            System.out.println("Add the all spices in the tray");

            System.out.println("Bake it in the oven");
            if(isDishBaked){
                System.out.println("My favorite dish is cooked :)");
            }else{
                System.out.println("Bake it in the oven");
            }
        }else{
            System.out.println("Wash the potatoes...");
        }

    }

}
