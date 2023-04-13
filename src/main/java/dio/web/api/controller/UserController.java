package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.repository.UserRepository;
import model.Usuario;

@RestController
@RequestMapping("/users")//CENTRALIZA OS PREFIXOS DAS REQUISIÇÕES, DELEGANDO Q TDS AS REQUISIÇÕES DO CONTROLLER INICIAM COM USERS.
public class UserController {
	@Autowired
	private UserRepository repository;

	@PostMapping()
	public void post(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}

	@PutMapping()
	public void put(@RequestBody Usuario usuario) {
		repository.update(usuario);
	}

	@GetMapping()
	public List<Usuario> getUsers() {
		return repository.findAll();
	}

	/*@GetMapping("/users/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return repository.findByUserName(username);
	}*/

	@GetMapping("/{id}")
	public Usuario getOne(@PathVariable("id") Integer id) {
		return repository.findById(id);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.remove(id);
	}
}
