package com.desing_pattens_AdaTech.demo.factorymethods.solucao;

import com.desing_pattens_AdaTech.demo.factorymethods.ProdutoFisico;

public class ProdutoFactory {

    public class Produto getInstance(TipoProdutoEnum tipoProdutoEnum){

        switch (tipoProdutoEnum){
            case FISICO:
                ProdutoFisico produtoFisico = new ProdutoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);;
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = new ProdutoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);;
                return produtoDigital;

            default:
                throw new IllegalAccessException("Tipo de produto não dísponivel");
        }
    }
}
