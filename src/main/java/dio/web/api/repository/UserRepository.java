package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import handler.BusinessException;
import model.Usuario;

@Repository
public class UserRepository {

	public void save(Usuario usuario){
		if (usuario.getLogin()==null) 
			throw new BusinessException("O campo login é obrigatório");
		if (usuario.getPassword()==null) 
			throw new BusinessException("O campo senha é obrigatório");
		if (usuario.getId()==null) 
			System.out.println("SAVE - Recebendo o usuário na camada de repositório");
		else 
			System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
		
			System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("gleyson","a81*@$&lg415^vfd"));
        usuarios.add(new Usuario("francisco","h4f74dg!@3]%>uof"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("gleyson","password");
    }
	public List<Usuario> findAll() {
		System.out.println("List- lsitando os usuárioa so sitems");//SIMULAÇÃO DE DADOS DE USUÁRIOS
		List<Usuario> usuarios = new ArrayList();
		usuarios.add(new Usuario("Vivian","erÇtyui!52dhyebmns524"));
		usuarios.add(new Usuario("Marina","rtyu52Ç365iopç!e4"));
		usuarios.add(new Usuario("Davi","523fsdfg412d5#5784$%*"));
		return usuarios;
	}
	
	/*public Usuario findByUserName(String username) {
		System.out.println("GET/name - Recebendo o nome: %d para localizar um usuário");
		return new Usuario("Vivian", "ty5fçlg&8$2415");
	}*/
}
