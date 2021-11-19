package br.com.zup.edu;

import java.math.BigDecimal;

public class DescontoService {


    public BigDecimal aplica(BigDecimal valorDoIngresso, TipoIngresso tipo) {

        // envia email
        // cadastra promoçao

        return tipo.aplicaDesconto(valorDoIngresso);
    }

}
