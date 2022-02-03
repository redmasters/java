import br.com.estruturadados.isidro.tests.ValidaPIN;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValidaPinTest {

    @Test
    public void comprimentoInvalido(){
        assertEquals(false, ValidaPIN.validaPin("1"));

    }
}
