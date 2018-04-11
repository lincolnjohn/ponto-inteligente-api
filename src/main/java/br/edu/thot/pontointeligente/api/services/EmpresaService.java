package br.edu.thot.pontointeligente.api.services;

import java.util.Optional;

import br.edu.thot.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	Empresa persistir(Empresa empresa);

}
