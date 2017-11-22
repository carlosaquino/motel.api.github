package py.edu.ucsa.motel.api.web.services;

import java.util.List;

import py.edu.ucsa.motel.api.core.model.Factura;

public interface FacturaService {
	public List<Factura> listarById(Integer id);
	public List<Factura> listarByIdCliente(Integer idCliente);
	public void insertar(Factura obj);
	public void modificar(Factura obj);
}
