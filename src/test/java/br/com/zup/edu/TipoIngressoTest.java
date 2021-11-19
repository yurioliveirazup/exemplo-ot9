package br.com.zup.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TipoIngressoTest {

    @DisplayName("Nao deve permitir receber valores negativos")
    @Test
    void teste1() {

        assertThrows(IllegalArgumentException.class, () -> {
            TipoIngresso inteira = TipoIngresso.INTEIRA;

            inteira.aplicaDesconto(new BigDecimal("-0.1"));
        });
    }

    @DisplayName("Nao deve permitir receber valores nulos")
    @Test
    void teste2() {

        assertThrows(IllegalArgumentException.class, () -> {
            TipoIngresso inteira = TipoIngresso.INTEIRA;

            inteira.aplicaDesconto(null);
        });
    }

    @DisplayName("Deve retornar o mesmo valor do ingresso quando o tipo for INTEIRA") // Deve fazer alguma coisa, quando isso acontecer
    @Test
    void teste3() {

        TipoIngresso inteira = TipoIngresso.INTEIRA;

        BigDecimal valorFinal = inteira.aplicaDesconto(BigDecimal.TEN);

        assertEquals(BigDecimal.TEN, valorFinal);

    }

    @DisplayName("Deve retornar metade do valor do ingresso quando o tipo for MEIA_ENTRADA") // Deve fazer alguma coisa, quando isso acontecer
    @Test
    void teste4() {

        TipoIngresso inteira = TipoIngresso.MEIA_ENTRADA;

        BigDecimal valorFinal = inteira.aplicaDesconto(BigDecimal.TEN);

        assertTrue(new BigDecimal("5.0").compareTo(valorFinal) == 0);
    }

    @DisplayName("Deve retornar zero quando o tipo for CORTESIA") // Deve fazer alguma coisa, quando isso acontecer
    @Test
    void teste5() {

        TipoIngresso inteira = TipoIngresso.CORTESIA;

        BigDecimal valorFinal = inteira.aplicaDesconto(BigDecimal.TEN);

        assertEquals(BigDecimal.ZERO, valorFinal);
    }

    @DisplayName("Deve retornar 25% do valor quando tipo do ingresso for AMIGOS_DA_PAULA") // Deve fazer alguma coisa, quando isso acontecer
    @Test
    void teste6() {

        TipoIngresso inteira = TipoIngresso.AMIGOS_DA_PAULA;

        BigDecimal valorFinal = inteira.aplicaDesconto(BigDecimal.TEN);

        assertTrue(new BigDecimal("2.5").compareTo(valorFinal) == 0);
    }

    @DisplayName("Deve retornar 10% do valor quando tipo do ingresso for ALUNOS_OT9") // Deve fazer alguma coisa, quando isso acontecer
    @Test
    void teste7() {

        TipoIngresso inteira = TipoIngresso.ALUNOS_OT9;

        BigDecimal valorFinal = inteira.aplicaDesconto(BigDecimal.TEN);

        assertEquals(new BigDecimal("1.0"), valorFinal);
    }
}