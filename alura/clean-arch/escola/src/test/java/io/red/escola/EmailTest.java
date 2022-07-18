package io.red.escola;

import io.red.escola.aluno.Email;
import io.red.escola.exceptions.EmailInvalidoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailTest {
    @Test
    void naoDeveCriarEmailsComEnderecoInvalidos() {
        assertThrows(EmailInvalidoException.class,
                () -> new Email(null));
        assertThrows(EmailInvalidoException.class,
                () -> new Email(""));
        assertThrows(EmailInvalidoException.class,
                () -> new Email("emailInvalido"));
    }

    @Test
    void deveCriarEmailsComEnderecosValidos() {
        String email = "username@domain.com";
        assertTrue(Email.validaEmail(email));
    }

}
