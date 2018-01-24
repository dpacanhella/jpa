package br.com.dpacanhella.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dpacanhella.jpa.domain.Conta;

public interface ContaRepository extends JpaRepository<Conta, Integer> {

    
}
