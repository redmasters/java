package io.red.escola.aluno;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private String endereco;

    public Email(String endereco) {
        validaEmail(endereco);
       this.endereco = endereco;
    }

    public static boolean validaEmail(String endereco){
        Pattern pattern = Pattern.compile("[-\\w\\.]+@[\\.\\w]+\\.\\w+");
        Matcher matcher = pattern.matcher(endereco);
        return matcher.matches();
    }

    // VALUE OBJECT
}
