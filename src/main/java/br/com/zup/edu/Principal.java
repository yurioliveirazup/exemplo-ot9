package br.com.zup.edu;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {

        // Valor do ingresso a obter o desconto
        // Percentual/Valor do desconto


        DescontoService service = new DescontoService();

        BigDecimal valorFinal = service.aplica(new BigDecimal("20.0"), TipoIngresso.AMIGOS_DA_PAULA);

        System.out.println(valorFinal);


    }
}
