package py.edu.ucsa.motel.api.web.services;

import java.util.List;

import py.edu.ucsa.motel.api.core.model.Producto;

public interface ProductoService {
	List<Producto> listarById(long id);
	List<Producto> listarByNombre(String nombre);
	List<Producto> listar();
	void guardar(Producto obj);
	void actualizar(Producto obj);
	void eliminarById(Integer id);
}
