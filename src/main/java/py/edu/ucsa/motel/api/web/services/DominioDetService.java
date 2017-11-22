package py.edu.ucsa.motel.api.web.services;

import java.util.List;

import py.edu.ucsa.motel.api.core.model.DominioDet;

public interface DominioDetService {
	List<DominioDet> listarById(long id);
	List<DominioDet> listarByDominio(long idDominio);
	List<DominioDet> listarByNombre(String nombre);
	void guardar(DominioDet obj);
	void actualizar(DominioDet obj);
	void eliminarById(Integer id);
}
