package com.desing_pattens_AdaTech.demo.builder.solucao;

import com.desing_pattens_AdaTech.demo.builder.problema.Pessoa;

import java.time.LocalDate;

public class TestePessoaComBuilder {

    public static void main(String[] args){
        Pessoa pessoa =
                new Pessoa.PessoaBuilder()
                        .nome("Ana")
                    .sobreNome("Bastos")
                    .documento("11223344")
                    .email("anabastoslps5gmail.com")
                    .apelido("Aninha")
                    .dataNascimento(LocalDate.of(2000,11,23))
                    .builder();

        System.out.println(pessoa);

        StringBuilder sb = new StringBuilder().append("palavra").append("palavra");
    }
}
