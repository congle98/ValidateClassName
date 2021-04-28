import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private final String CLASS_NAME_VALIDATE = "^(C||A||P)[0-9]{4}(G||H||I||K||L||M)$";
    private Pattern pattern;
    private Matcher matcher;
    public ValidateClassName(){
        pattern = Pattern.compile(CLASS_NAME_VALIDATE);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.find();
    }

    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        String className = "C0323M";
        System.out.println(validateClassName.validate(className));
    }
}
