package com.profissionais.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.profissionais.apirest.model.Profissionais;
import com.profissionais.apirest.repository.ProfissionalRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Profissionais")
@CrossOrigin(origins = "*")
public class ProfissionalResource {

	@Autowired
	 ProfissionalRepository profissionalRepository;
	
	//Método Get da api
	
	@GetMapping("/profissionais")
	@ApiOperation(value="Retorna uma lista de profissionais")
	public List<Profissionais> listaProfissionais(){
		return profissionalRepository.findAll();
	}
	@GetMapping("/profissional/{id}")
	@ApiOperation(value="Retorna um unico profissional")
	public Profissionais listaProfissionalUnico(@PathVariable(value="id") long id ){
		return profissionalRepository.findById(id);
	}
	
	//Método Post da ap
	
	
	@PostMapping("/profissional")
	@ApiOperation(value="Salva um profissional")
	public Profissionais salvaProfissional(@RequestBody Profissionais profissional) {
		return profissionalRepository.save(profissional);
	}
	//MÉTODO DELETE DA API
	@DeleteMapping("/profissional")
	@ApiOperation(value="Deleta um  profissional")
	public void deletaProfissional(@RequestBody Profissionais profissional) {
	  profissionalRepository.delete(profissional);
	}
	
	//MÉTODO PUT DA API
	@PutMapping("/profissional")
	@ApiOperation(value="Atualiza um profissional")
	public Profissionais atualizaProfissional(@RequestBody Profissionais profissional) {
	  return profissionalRepository.save(profissional);
	}
	
	
}
