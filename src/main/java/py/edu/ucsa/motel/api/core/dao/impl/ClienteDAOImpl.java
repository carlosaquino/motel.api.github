package py.edu.ucsa.motel.api.core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import py.edu.ucsa.motel.api.core.dao.AbstractDao;
import py.edu.ucsa.motel.api.core.dao.ClienteDAO;
import py.edu.ucsa.motel.api.core.model.Cliente;

@Repository("clienteDAO")
public class ClienteDAOImpl extends AbstractDao<Integer, Cliente > implements ClienteDAO {

	@Override
	public List<Cliente> listarById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarById(long id) {
		// TODO Auto-generated method stub

	}

}
