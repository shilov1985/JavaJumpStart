public class Name {

    /**
     */
    public static void main(String[] args) {
        String myLittleName = "Miroslav";
        String mySurname = "Shilov";
        String birdDate = "04.07.1985";
        int myAge = 38;
        int friendAge = 34;

        String friendLitteleName = "Ivan";
        String friendSureName = "Tcolov";

        System.out.println(myLittleName);
        System.out.println(myLittleName.equals(friendLitteleName));
        System.out
                .println(myLittleName.equalsIgnoreCase(friendLitteleName));
        System.out.println(myLittleName.compareTo(friendLitteleName));

        String myFullName = myLittleName.concat(" ").concat(mySurname);
        System.out.println(myFullName);
        System.out.println(birdDate);
        System.out.println(myFullName + " " + myAge);
        String friendFullName = friendLitteleName.concat(" ").concat(
                friendSureName);
        System.out.println(friendFullName + " " + friendAge);
    }

}
