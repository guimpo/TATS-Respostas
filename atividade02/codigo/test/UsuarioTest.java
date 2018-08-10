import atividade02.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paulo
 */
public class UsuarioTest {
    
     @Test
     public void teste01() {
         Usuario u = new Usuario();
         
         String nome = "nome";
         String senha = "senha";
         String senhaConfirmada = "senhaConfirmada";
         
         u.setNome(nome);
         assertTrue(u.getNome().equalsIgnoreCase("nome"));
     }
}
