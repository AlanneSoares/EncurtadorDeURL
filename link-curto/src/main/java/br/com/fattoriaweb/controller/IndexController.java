package br.com.fattoriaweb.controller;

import br.com.fattoriaweb.model.CadastroURL;
import br.com.fattoriaweb.service.CadastroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    private CadastroService cadastroService;

    public IndexController(CadastroService cadastroService) {
        this.cadastroService = cadastroService;
    }

    @RequestMapping("/cadastrarUrl")
    public String form() {
        return "formCadastro";
    }

    @RequestMapping("/listar")
    public ResponseEntity<List<CadastroURL>> listar() {
        return new ResponseEntity<List<CadastroURL>>(cadastroService.listar(), HttpStatus.OK);
    }

    @RequestMapping(value = "/criar", method = RequestMethod.POST)
    public void criar(@RequestBody CadastroURL cadastroURL) {
        cadastroService.criar(cadastroURL);
    }
}