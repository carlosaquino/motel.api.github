package py.edu.ucsa.motel.api.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.edu.ucsa.motel.api.core.model.DominioDet;
import py.edu.ucsa.motel.api.web.services.DominioDetService;


@Service("dominioDetService")
@Transactional
public class DominioDetServiceImpl implements DominioDetService {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DominioDet> listarById(long id) {
		Query q = em.createNativeQuery("SELECT d.* "
                + "		FROM dominios_det d "
                + "		WHERE id =  :pvalor",DominioDet.class);
		q.setParameter("pvalor", id);
		return (ArrayList<DominioDet>)q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DominioDet> listarByDominio(long idDominio) {
		Query q = em.createNativeQuery("SELECT d.* "
                + "		FROM dominios_det d "
                + "		WHERE id_dominio =  :pvalor",DominioDet.class);
		q.setParameter("pvalor", idDominio);
		return (ArrayList<DominioDet>)q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<DominioDet> listarByNombre(String nombre) {
		Query q = em.createNativeQuery("SELECT d.* "
				+ "		FROM dominios_det d "
				+ "		WHERE (lower(d.descripcion) LIKE :pvalor OR :pvalor = '')",DominioDet.class);
		q.setParameter("pvalor", nombre != null ? "%" + nombre.toLowerCase() + "%" : "");
		return (ArrayList<DominioDet>)q.getResultList();
	}

	@Override
	public void guardar(DominioDet obj) {
		em.persist(em.merge(obj));
	}

	@Override
	public void actualizar(py.edu.ucsa.motel.api.core.model.DominioDet obj) {
		em.persist(em.merge(obj));
	}

	@Override
	public void eliminarById(Integer id) {
		DominioDet obj = em.find(DominioDet.class, id);
		em.remove(obj);
	}

}
