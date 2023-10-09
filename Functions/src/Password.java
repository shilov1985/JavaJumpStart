

public class Password {
    public static void main(String[] args) {
        String password = "Wq445@%$";

        System.out.println("Validity of " + password + " is " + isValid(password));
    }

    private static boolean isValid(String password) {


        return password.matches("^(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%^&!-+=()])(?=\\S+$).{8}$");
    }
}
