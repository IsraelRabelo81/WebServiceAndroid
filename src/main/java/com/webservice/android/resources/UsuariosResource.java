package com.webservice.android.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.android.domain.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuariosResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Usuario> listar() {
		
		Usuario usuario = new Usuario("001","Israel", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		List<Usuario> lista = new ArrayList<>();
		lista.add(usuario);
		
		return lista;
	}
}
