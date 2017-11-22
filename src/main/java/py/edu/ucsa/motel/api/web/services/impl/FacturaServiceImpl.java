package py.edu.ucsa.motel.api.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import py.edu.ucsa.motel.api.core.model.Factura;
import py.edu.ucsa.motel.api.web.services.FacturaService;

@Service("facturaService")
@Transactional
public class FacturaServiceImpl implements FacturaService {

	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Factura> listarById(Integer id) {
		Query q = em.createNativeQuery("SELECT f.* "
                + "		FROM facturas f "
                + "		WHERE id =  :pvalor",Factura.class);
		q.setParameter("pvalor", id);
		return (ArrayList<Factura>)q.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Factura> listarByIdCliente(Integer idCliente) {
		Query q = em.createNativeQuery("SELECT f.* "
                + "		FROM facturas f "
                + "		WHERE id_cliente =  :pvalor",Factura.class);
		q.setParameter("pvalor", idCliente);
		return (ArrayList<Factura>)q.getResultList();
	}

	@Override
	public void insertar(Factura obj) {
		em.persist(em.merge(obj));
	}

	@Override
	public void modificar(Factura obj) {
		em.persist(em.merge(obj));
	}

}
