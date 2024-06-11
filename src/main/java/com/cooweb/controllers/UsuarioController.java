package com.cooweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.UsuarioDao;
import com.cooweb.models.Usuario;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioDao usuarioDao;
	
	/*
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		
		return  List.of("Diego","Pablo","Martin");
	}
	@RequestMapping(value="usuarios")
	public Usuario listarUsuarios() {
		
		Usuario usuario=new Usuario();
		usuario.setNombre("Rocio");
		usuario.setApellido("Cabrera");
		usuario.setEmail("ro.cabrera97@gmail.com");
		usuario.setTelefono("132999837");
		
		return usuario;
		
	}
	*/
	/*
	@RequestMapping(value="usuario/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		
		Usuario usuario=new Usuario();
		usuario.setId(id);
		usuario.setNombre("Rocio");
		usuario.setApellido("Cabrera");
		usuario.setEmail("ro.cabrera97@gmail.com");
		usuario.setTelefono("132999837");
		usuario.setPassword("123456");
		
		return usuario;
		
	}*/
	@RequestMapping(value="usuario/lista_user")
	public List<Usuario> listar_variosUsuarios() {
		
		List<Usuario> usuarios=new ArrayList<>();
		
		Usuario usuario1=new Usuario();
		usuario1.setId(3L);
		usuario1.setNombre("Rocio");
		usuario1.setApellido("Cabrera");
		usuario1.setEmail("ro.cabrera97@gmail.com");
		usuario1.setTelefono("132999837");
		usuario1.setPassword("123456");
		
		Usuario usuario2=new Usuario();
		usuario2.setId(4L);
		usuario2.setNombre("Jesús");
		usuario2.setApellido("Pérez");
		usuario2.setEmail("jesusp@gmail.com");
		usuario2.setTelefono("13223342");
		usuario2.setPassword("1234567");
		
		Usuario usuario3=new Usuario();
		usuario3.setId(5L);
		usuario3.setNombre("Pedro");
		usuario3.setApellido("Juanes");
		usuario3.setEmail("pedritoj@gmail.com");
		usuario3.setTelefono("145665433");
		usuario3.setPassword("12345678");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		return usuarios;
	}
	
	@RequestMapping(value="api/usuarios")
	public List<Usuario> getUsuario(){
		
		List<Usuario> user=usuarioDao.obtenerUsuarios();
		
		return user;
	}
}

