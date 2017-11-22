package py.edu.ucsa.motel.api.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.edu.ucsa.motel.api.core.model.Cliente;
import py.edu.ucsa.motel.api.web.services.ClienteService;

@Service("clienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listarById(long id) {
			Query q = em.createNativeQuery("SELECT c.* "
				                 + "		FROM clientes c "
				                 + "		WHERE (id =  :pvalor OR :pvalor is null)",Cliente.class);
			q.setParameter("pvalor", id);
			return (ArrayList<Cliente>)q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listarByNombre(String nombre) {
		Query q = em.createNativeQuery("SELECT c.* "
						+ "		FROM clientes c "
						+ "		WHERE (lower(nombre || ' ' || apellido) LIKE :pvalor OR :pvalor = '')",Cliente.class);
		q.setParameter("pvalor", nombre != null ? "%" + nombre.toLowerCase() + "%" : "");
		return (ArrayList<Cliente>)q.getResultList();
	}

	@Override
	public List<Cliente> listar() {
		return (ArrayList<Cliente>) em.createNamedQuery("Cliente.findAll",Cliente.class).getResultList();
	}

	@Override
	public void guardar(Cliente cliente) {
		em.persist(em.merge(cliente));
	}

	@Override
	public void actualizar(Cliente cliente) {
		em.persist(em.merge(cliente));
	}

	@Override
	public void eliminarById(Integer id) {
		Cliente cliente = em.find(Cliente.class, id);
		em.remove(cliente);
	}


}
