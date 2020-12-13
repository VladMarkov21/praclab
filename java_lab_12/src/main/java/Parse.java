import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parse implements IParse{
    public boolean findSize(String str) throws IOException {
        if(str.length()<8) throw new IOException("Маленькая длина пароля !");
        return true;

    }

    public boolean findBaseCount(String str) throws IOException {
        Pattern pattern=Pattern.compile("[^a-zA-Z0-9_]");
        Matcher matcher = pattern.matcher(str);
        if(matcher.find()==true) throw new IOException("Недопустимые символы в пароле !");

        return true;
    }

    public boolean findMinValue(String str) throws IOException {
        Pattern patternBigLetter =Pattern.compile("[A-Z]");
        Pattern patternSmalLetter =Pattern.compile("[a-z]");
        Pattern patternNomber =Pattern.compile("[0-9]");
        Matcher matcherBigLetter= patternBigLetter.matcher(str);
        Matcher matcherSmalLetter= patternSmalLetter.matcher(str);
        Matcher matcherNomber= patternNomber.matcher(str);
        if(!matcherBigLetter.find())
            throw new IOException("В пароле должна присутствовать хотя бы одна заглавная буква !");
        if(!matcherSmalLetter.find())
            throw  new IOException("В пароле должна присутствовать хотябы одна прописная буква !");
        if(!matcherNomber.find())
            throw new IOException("В пароле должна присутствовать хотя бы одна цифра !");
        return true;

    }
}
