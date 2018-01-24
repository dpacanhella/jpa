package br.com.dpacanhella.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dpacanhella.jpa.domain.Conta;
import br.com.dpacanhella.jpa.repository.ContaRepository;
import br.com.dpacanhella.jpa.service.ContaService;

@Service
public class ContaServiceImpl implements ContaService {

    @Autowired
    private ContaRepository contaRepository;

    @Override
    public void save(Conta conta) {
        contaRepository.save(conta);
    }

}
