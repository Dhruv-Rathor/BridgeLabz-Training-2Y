interface SecurityUtils {
    static boolean isStrong(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*[A-Z].*") && pwd.matches(".*[0-9].*");
    }
}
public class PasswordValidator {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrong("Pass1234"));
    }
}
