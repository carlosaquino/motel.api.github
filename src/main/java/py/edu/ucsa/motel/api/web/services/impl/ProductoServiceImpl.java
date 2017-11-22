package py.edu.ucsa.motel.api.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.edu.ucsa.motel.api.core.model.Producto;
import py.edu.ucsa.motel.api.web.services.ProductoService;


@Service("productoService")
@Transactional
public class ProductoServiceImpl implements ProductoService {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> listarById(long id) {
		Query q = em.createNativeQuery("SELECT p.* "
                + "		FROM productos p "
                + "		WHERE (id =  :pvalor OR :pvalor is null)",Producto.class);
		q.setParameter("pvalor", id);
		return (ArrayList<Producto>)q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> listarByNombre(String nombre) {
		Query q = em.createNativeQuery("SELECT p.* "
				+ "		FROM productos p "
				+ "		WHERE (lower(p.descripcion) LIKE :pvalor OR :pvalor = '')",Producto.class);
		q.setParameter("pvalor", nombre != null ? "%" + nombre.toLowerCase() + "%" : "");
		return (ArrayList<Producto>)q.getResultList();
	}

	@Override
	public List<Producto> listar() {
		return (ArrayList<Producto>) em.createNamedQuery("Producto.findAll",Producto.class).getResultList();
	}

	@Override
	public void guardar(Producto obj) {
		em.persist(em.merge(obj));
	}

	@Override
	public void actualizar(Producto obj) {
		em.persist(em.merge(obj));
	}

	@Override
	public void eliminarById(Integer id) {
		Producto obj = em.find(Producto.class, id);
		em.remove(obj);		
	}

}
