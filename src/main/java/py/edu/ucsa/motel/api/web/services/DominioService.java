package py.edu.ucsa.motel.api.web.services;

import java.util.List;

import py.edu.ucsa.motel.api.core.model.Dominio;

public interface DominioService {
	List<Dominio> listarById(long id);
	List<Dominio> listarByNombre(String nombre);
	List<Dominio> listar();
	void guardar(Dominio obj);
	void actualizar(Dominio obj);
	void eliminarById(Integer id);
}
