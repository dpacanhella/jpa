package br.com.dpacanhella.jpa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.dpacanhella.jpa.domain.Conta;
import br.com.dpacanhella.jpa.repository.ContaRepository;

public class MethodsTests extends JpaApplicationTests{

    @Autowired
    private ContaRepository contaRepository;

    @Test
    public void testOne() {
        Conta conta = new Conta();
        conta.setTitular("asdqwerqwerqwerf22");
        conta.setNumero("qwerweqr");
        conta.setBanco("Saaserqwerqwerqwerqwerdf2");
        conta.setAgencia("0234wqerqwerqwerqewrqwerqwezasdf");
        
        Conta saved = contaRepository.saveAndFlush(conta);
        
        Assert.assertEquals(saved.getTitular(), conta.getTitular());
    }

    

}
