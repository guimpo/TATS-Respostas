import atividade02.SenhaValidator;
import atividade02.Usuario;
import atividade02.UsuarioDAO;
import atividade02.UsuarioValidator;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author paulo
 */
public class UsuarioValidatorTest {
    
    @Test(expected = Exception.class)
    public void teste01() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "nome";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        when(uDaoMock.getByName(nome))
                .thenReturn(u);
        uv.ehUsuarioValido(u);
    }
    
    @Test(expected = Exception.class)
    public void teste02() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "cinco";
        String senha = "senha";
        String senhaConfirmada = "senhaDiferente";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        when(uDaoMock.getByName(nome))
                .thenReturn(u);
        uv.ehUsuarioValido(u);
    }
    
    @Test(expected = Exception.class)
    public void teste03() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "cinco";
        String senha = "senhaIgual";
        String senhaConfirmada = "senhaIgual";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        when(uDaoMock.getByName(nome))
                .thenReturn(u);
        uv.ehUsuarioValido(u);
    }
    
    @Test
    public void teste04() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "cinco";
        String senha = "senhaIgual";
        String senhaConfirmada = "senhaIgual";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        SenhaValidator svMock = mock(SenhaValidator.class);
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        uv.setSenhaValidator(svMock);
        when(svMock.verificar(senha))
                .thenReturn(false);
        uv.ehUsuarioValido(u);
    }
    
    @Test(expected = Exception.class)
    public void teste05() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "cinco";
        String senha = "senha";
        String senhaConfirmada = "senhaDiferente";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        SenhaValidator svMock = mock(SenhaValidator.class);
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        uv.setSenhaValidator(svMock);
        when(svMock.verificar(senha))
                .thenReturn(true);
        uv.ehUsuarioValido(u);
    }
    
    @Test(expected = Exception.class)
    public void teste06() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "^^";
        String senha = "senha";
        String senhaConfirmada = "senhaDiferente";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        SenhaValidator svMock = mock(SenhaValidator.class);
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        uv.setSenhaValidator(svMock);
        when(svMock.verificar(senha))
                .thenReturn(false);
        uv.ehUsuarioValido(u);
    }
    
    @Test(expected = Exception.class)
    public void teste07() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "a1a1a";
        String senha = "senha";
        String senhaConfirmada = "senha";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        SenhaValidator svMock = mock(SenhaValidator.class);
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        uv.setSenhaValidator(svMock);
        when(svMock.verificar(senha))
                .thenReturn(true);
        uv.ehUsuarioValido(u);
    }
    
    @Test
    public void teste08() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "(^v^)";
        String senha = "senha";
        String senhaConfirmada = "senha";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        SenhaValidator svMock = mock(SenhaValidator.class);
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        uv.setSenhaValidator(svMock);
        when(svMock.verificar(senha))
                .thenReturn(false);
        uv.ehUsuarioValido(u);
    }
    
    @Test
    public void teste09() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "abcde0";
        String senha = "senha";
        String senhaConfirmada = "senha";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        SenhaValidator svMock = mock(SenhaValidator.class);
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        uv.setSenhaValidator(svMock);
        when(svMock.verificar(senha))
                .thenReturn(false);
        uv.ehUsuarioValido(u);
    }
    
    @Test(expected = Exception.class)
    public void teste10() throws Exception {
        UsuarioDAO uDaoMock = mock(UsuarioDAO.class);
        String nome = "abcde0";
        String senha = "senha";
        String senhaConfirmada = "senha";
        
        Usuario u = new Usuario();
        u.setNome(nome);
        u.setSenha(senha);
        u.setSenhaConfirmada(senhaConfirmada);
        
        SenhaValidator svMock = mock(SenhaValidator.class);
        UsuarioValidator uv = new UsuarioValidator(uDaoMock);
        uv.setSenhaValidator(svMock);
        when(svMock.verificar(senha))
                .thenReturn(false);
        
        when(uDaoMock.getByName(nome)).thenReturn(u);
        
        uv.ehUsuarioValido(u);
    }
}
