import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public boolean checkEmail(String text) {
        String regex = "^[a-zA-Z][a-zA-Z0-9.]*[a-zA-Z0-9]@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();

    }
}
