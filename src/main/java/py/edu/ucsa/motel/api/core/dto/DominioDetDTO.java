package py.edu.ucsa.motel.api.core.dto;

import java.io.Serializable;
import java.util.List;



public class DominioDetDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String codigo;

	private String descripcion;

	private String estado;

	private List<ClienteDTO> clientes;

	private DominioDTO dominio;

	private DominioDetDTO dominiosDet;

	private List<DominioDetDTO> dominiosDets;

	private List<FacturaDTO> facturas;

	private List<HabitacionDTO> habitaciones1;

	private List<HabitacionDTO> habitaciones2;

	private List<HabitacionDetDTO> habitacionesDets;

	private List<PagoDTO> pagos;

	private List<ProductoDTO> productos;

	public DominioDetDTO() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<ClienteDTO> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<ClienteDTO> clientes) {
		this.clientes = clientes;
	}

	public ClienteDTO addCliente(ClienteDTO cliente) {
		getClientes().add(cliente);
		cliente.setDominiosDet(this);

		return cliente;
	}

	public ClienteDTO removeCliente(ClienteDTO cliente) {
		getClientes().remove(cliente);
		cliente.setDominiosDet(null);

		return cliente;
	}

	public DominioDTO getDominio() {
		return this.dominio;
	}

	public void setDominio(DominioDTO dominio) {
		this.dominio = dominio;
	}

	public DominioDetDTO getDominiosDet() {
		return this.dominiosDet;
	}

	public void setDominiosDet(DominioDetDTO dominiosDet) {
		this.dominiosDet = dominiosDet;
	}

	public List<DominioDetDTO> getDominiosDets() {
		return this.dominiosDets;
	}

	public void setDominiosDets(List<DominioDetDTO> dominiosDets) {
		this.dominiosDets = dominiosDets;
	}

	public DominioDetDTO addDominiosDet(DominioDetDTO dominiosDet) {
		getDominiosDets().add(dominiosDet);
		dominiosDet.setDominiosDet(this);

		return dominiosDet;
	}

	public DominioDetDTO removeDominiosDet(DominioDetDTO dominiosDet) {
		getDominiosDets().remove(dominiosDet);
		dominiosDet.setDominiosDet(null);

		return dominiosDet;
	}

	public List<FacturaDTO> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<FacturaDTO> facturas) {
		this.facturas = facturas;
	}

	public FacturaDTO addFactura(FacturaDTO factura) {
		getFacturas().add(factura);
		factura.setDominiosDet(this);

		return factura;
	}

	public FacturaDTO removeFactura(FacturaDTO factura) {
		getFacturas().remove(factura);
		factura.setDominiosDet(null);

		return factura;
	}

	public List<HabitacionDTO> getHabitaciones1() {
		return this.habitaciones1;
	}

	public void setHabitaciones1(List<HabitacionDTO> habitaciones1) {
		this.habitaciones1 = habitaciones1;
	}

	public HabitacionDTO addHabitaciones1(HabitacionDTO habitaciones1) {
		getHabitaciones1().add(habitaciones1);
		habitaciones1.setDominiosDet1(this);

		return habitaciones1;
	}

	public HabitacionDTO removeHabitaciones1(HabitacionDTO habitaciones1) {
		getHabitaciones1().remove(habitaciones1);
		habitaciones1.setDominiosDet1(null);

		return habitaciones1;
	}

	public List<HabitacionDTO> getHabitaciones2() {
		return this.habitaciones2;
	}

	public void setHabitaciones2(List<HabitacionDTO> habitaciones2) {
		this.habitaciones2 = habitaciones2;
	}

	public HabitacionDTO addHabitaciones2(HabitacionDTO habitaciones2) {
		getHabitaciones2().add(habitaciones2);
		habitaciones2.setDominiosDet2(this);

		return habitaciones2;
	}

	public HabitacionDTO removeHabitaciones2(HabitacionDTO habitaciones2) {
		getHabitaciones2().remove(habitaciones2);
		habitaciones2.setDominiosDet2(null);

		return habitaciones2;
	}

	public List<HabitacionDetDTO> getHabitacionesDets() {
		return this.habitacionesDets;
	}

	public void setHabitacionesDets(List<HabitacionDetDTO> habitacionesDets) {
		this.habitacionesDets = habitacionesDets;
	}

	public HabitacionDetDTO addHabitacionesDet(HabitacionDetDTO habitacionesDet) {
		getHabitacionesDets().add(habitacionesDet);
		habitacionesDet.setDominiosDet(this);

		return habitacionesDet;
	}

	public HabitacionDetDTO removeHabitacionesDet(HabitacionDetDTO habitacionesDet) {
		getHabitacionesDets().remove(habitacionesDet);
		habitacionesDet.setDominiosDet(null);

		return habitacionesDet;
	}

	public List<PagoDTO> getPagos() {
		return this.pagos;
	}

	public void setPagos(List<PagoDTO> pagos) {
		this.pagos = pagos;
	}

	public PagoDTO addPago(PagoDTO pago) {
		getPagos().add(pago);
		pago.setDominiosDet(this);

		return pago;
	}

	public PagoDTO removePago(PagoDTO pago) {
		getPagos().remove(pago);
		pago.setDominiosDet(null);

		return pago;
	}

	public List<ProductoDTO> getProductos() {
		return this.productos;
	}

	public void setProductos(List<ProductoDTO> productos) {
		this.productos = productos;
	}

	public ProductoDTO addProducto(ProductoDTO producto) {
		getProductos().add(producto);
		producto.setDominiosDet(this);

		return producto;
	}

	public ProductoDTO removeProducto(ProductoDTO producto) {
		getProductos().remove(producto);
		producto.setDominiosDet(null);

		return producto;
	}

}