package br.com.fattoriaweb.service;

import br.com.fattoriaweb.model.CadastroURL;
import br.com.fattoriaweb.repository.CadastroRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CadastroService {

    private CadastroRepository cadastroRepository;

    public CadastroService(CadastroRepository cadastroRepository) {
        this.cadastroRepository = cadastroRepository;
    }

    public List<CadastroURL> listar() {
        return cadastroRepository.findAll();
    }

    public void criar(CadastroURL cadastroURL) {

        //todo: lógica do link curto aqui, tranformar url em hash e pegar os 6 últimos caracteres e jogar no campo link curto
        cadastroURL.setLinkCurto("");
        cadastroRepository.save(cadastroURL);

    }
}
