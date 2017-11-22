package py.edu.ucsa.motel.api.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.edu.ucsa.motel.api.core.model.Dominio;
import py.edu.ucsa.motel.api.web.services.DominioService;

@Service("dominioService")
@Transactional
public class DominioServiceImpl implements DominioService {

	@PersistenceContext
	EntityManager em;	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Dominio> listarById(long id) {
		Query q = em.createNativeQuery("SELECT d.* "
                + "		FROM dominios d "
                + "		WHERE (id =  :pvalor OR :pvalor is null)",Dominio.class);
		q.setParameter("pvalor", id);
		return (ArrayList<Dominio>)q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Dominio> listarByNombre(String nombre) {
		Query q = em.createNativeQuery("SELECT d.* "
				+ "		FROM dominios d "
				+ "		WHERE (lower(d.descripcion) LIKE :pvalor OR :pvalor = '')",Dominio.class);
		q.setParameter("pvalor", nombre != null ? "%" + nombre.toLowerCase() + "%" : "");
		return (ArrayList<Dominio>)q.getResultList();
	}

	@Override
	public List<Dominio> listar() {
		return (ArrayList<Dominio>) em.createNamedQuery("Dominio.findAll",Dominio.class).getResultList();
	}

	@Override
	public void guardar(Dominio obj) {
		em.persist(em.merge(obj));
	}

	@Override
	public void actualizar(Dominio obj) {
		em.persist(em.merge(obj));
	}

	@Override
	public void eliminarById(Integer id) {
		Dominio obj = em.find(Dominio.class, id);
		em.remove(obj);
	}

}
