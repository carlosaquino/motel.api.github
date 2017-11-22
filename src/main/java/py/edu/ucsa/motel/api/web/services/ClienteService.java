package py.edu.ucsa.motel.api.web.services;

import java.util.List;

import py.edu.ucsa.motel.api.core.model.Cliente;

public interface ClienteService {
	List<Cliente> listarById(long id);
	List<Cliente> listarByNombre(String nombre);
	List<Cliente> listar();
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminarById(Integer id);
}
