package com.exemplo.calculaimc.controller;

import com.exemplo.calculaimc.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IMCController {

    @GetMapping("/")
    public String form() {
        return "formulario";
    }

    @PostMapping("/calcular")
    public String calcularIMC(@RequestParam String nome,
                              @RequestParam double peso,
                              @RequestParam double altura,
                              Model model) {

        double alturaEmMetros = altura / 100;
        double imc = peso / (alturaEmMetros * alturaEmMetros);
        String classificacao;
        String mensagem;
        String apoio;

        if (imc < 18.6) {
            classificacao = "Abaixo do peso";
            mensagem = "Você é forte, continue se cuidando!";
            apoio = "https://drakarlafazollo.com.br/especialidades/tratamento-de-baixo-peso/";
        } else if (imc < 25) {
            classificacao = "Peso ideal";
            mensagem = "Excelente! Continue assim!";
            apoio = "https://www.nucleodrclaudiomutti.com.br/importancia-de-manter-um-peso-saudavel/";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
            mensagem = "Você está no caminho certo, só um pequeno ajuste!";
            apoio = "https://www.gov.br/saude/pt-br/assuntos/saude-brasil/eu-quero-ter-peso-saudavel/noticias/2021/voce-sabe-a-diferenca-entre-sobrepeso-e-obesidade";
        } else {
            classificacao = "Obesidade";
            mensagem = "Você é incrível! Sua saúde é o que importa!";
            apoio = "https://www.gov.br/saude/pt-br/assuntos/saude-brasil/eu-quero-ter-peso-saudavel/noticias/2023/quais-sao-as-principais-recomendacoes-para-o-tratamento-da-obesidade-no-sus";
        }

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setPeso(peso);
        pessoa.setAltura(altura);
        pessoa.setClassificacao(classificacao);
        pessoa.setMensagem(mensagem);
        pessoa.setApoio(apoio);

        model.addAttribute("pessoa", pessoa);
        return "resultado";
    }
}