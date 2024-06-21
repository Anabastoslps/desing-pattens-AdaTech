package com.desing_pattens_AdaTech.demo.factorymethods.solucao;

import com.desing_pattens_AdaTech.demo.factorymethods.TipoProdutoEnum;

public class TesteProdutoComFactoryMethods {

    public static void main(String[] args){
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAl);


        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);
    }
}
