package py.edu.ucsa.motel.api.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.ucsa.motel.api.core.model.Cliente;
import py.edu.ucsa.motel.api.web.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	//Metodo para listar todo
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> listar() {
		return new ResponseEntity<List<Cliente>>(clienteService.listar(), HttpStatus.OK);
	}
	
	//Metodo para listar por id
	@RequestMapping(value="/by-id/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> listarById(@PathVariable("id") long id) {
		return new ResponseEntity<List<Cliente>>(clienteService.listarById(id), HttpStatus.OK);
	}

	//Metodo para listar por nombre
	@RequestMapping(value="/by-nombre/{nombre}",method=RequestMethod.GET)
	public ResponseEntity<?> listarByNombre(@PathVariable("nombre") String nombre) {
		return new ResponseEntity<List<Cliente>>(clienteService.listarByNombre(nombre), HttpStatus.OK);
	}	
	
	//Metodo para insertar
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> insertar(@RequestBody Cliente cliente){
		clienteService.guardar(cliente);
		return new ResponseEntity<Object>(cliente, HttpStatus.OK);		
	}
	
	//Metodo para modificar
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<?> modificar(@RequestBody Cliente cliente){
		clienteService.actualizar(cliente);
		return new ResponseEntity<Object>(cliente, HttpStatus.OK);		
	}	
	
	//Metodo para eliminar
    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
    	clienteService.eliminarById(id);
    	return new ResponseEntity<Object>(id, HttpStatus.OK);
    }	
}
