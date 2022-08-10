package br.com.alura.leilao.service;

import org.springframework.stereotype.Service;

import br.com.alura.leilao.domain.Lance;
import br.com.alura.leilao.domain.Leilao;
import br.com.alura.leilao.domain.Usuario;

@Service
public class EnviadorDeEmails {

	// apenas simula o envio de um email...
	public void enviarEmailVencedorLeilao(Lance lanceVencedor) {
		Usuario vencedor = lanceVencedor.getUsuario();
		Leilao leilao = lanceVencedor.getLeilao();
		
		String email = String.format("Parabens {}! Voce venceu o leilao {} com o lance de R${}", vencedor.getNome(), leilao.getNome(), lanceVencedor.getValor());

		System.out.println(email);
	}

}
