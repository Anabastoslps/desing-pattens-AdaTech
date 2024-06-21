package com.desing_pattens_AdaTech.demo.factorymethods.problema;

import com.desing_pattens_AdaTech.demo.factorymethods.ProdutoFisico;

public class TesteProduto {

    public static void main(String[] args){

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        ProdutoDigital produtoDigital = new ProdutoDigital();
        produtoDigital.setPossuiDimenssoesFisicas(false);
    }
}
