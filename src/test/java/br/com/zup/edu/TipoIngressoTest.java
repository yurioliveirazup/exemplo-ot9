package br.com.zup.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TipoIngressoTest {


    @DisplayName("Deve retornar o mesmo valor do ingresso quando o tipo for inteira") // Deve fazer alguma coisa, quando isso acontecer
    @Test
    void teste1() {

        TipoIngresso inteira = TipoIngresso.INTEIRA;

        BigDecimal valorFinal = inteira.aplicaDesconto(BigDecimal.TEN);

        assertEquals(BigDecimal.TEN, valorFinal);

    }

    @DisplayName("Nao deve permitir receber valores negativos")
    @Test
    void teste2() {

        assertThrows(IllegalArgumentException.class, () -> {
            TipoIngresso inteira = TipoIngresso.INTEIRA;

            inteira.aplicaDesconto(new BigDecimal("-0.1"));
        });
    }
}