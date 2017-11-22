package py.edu.ucsa.motel.api.core.dao;

import java.util.List;

import py.edu.ucsa.motel.api.core.model.Cliente;

public interface ClienteDAO {
	List<Cliente> listarById(long id);
	List<Cliente> listar();
	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminarById(long id);
}
