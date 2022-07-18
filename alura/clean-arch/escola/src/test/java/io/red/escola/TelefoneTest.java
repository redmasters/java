package io.red.escola;


import io.red.escola.aluno.Telefone;
import io.red.escola.exceptions.TelefoneInvalidoException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class TelefoneTest {
    @Test
    void naoDeveCriarTelefonesInvalidos(){
        assertThrows(TelefoneInvalidoException.class,
                () -> new Telefone("9", null));
    }
}
