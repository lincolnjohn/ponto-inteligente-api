package br.edu.thot.pontointeligente.api.services;

import java.util.Optional;

import br.edu.thot.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	Optional<Funcionario> buscarPorCpf(String cpf);
	
	Funcionario persistir(Funcionario funcionario);
	
	Optional<Funcionario> buscarPorEmail(String email);
	
	//Optional<Funcionario> buscarPorId(Long id);
	
	

}
