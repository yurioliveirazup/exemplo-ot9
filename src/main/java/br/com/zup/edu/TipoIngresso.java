package br.com.zup.edu;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum TipoIngresso {

    INTEIRA {

        @Override
        public BigDecimal aplicaDesconto(BigDecimal valor) {

            if (valor == null) {
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }

            if (valor.compareTo(BigDecimal.ZERO) < 0) { // se for menor, ele retorna -1
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }

            return valor;
        }
    },

    MEIA_ENTRADA {

        @Override
        public BigDecimal aplicaDesconto(BigDecimal valor) {

            if (valor == null) {
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }

            if (valor.compareTo(BigDecimal.ZERO) < 0) { // se for menor, ele retorna -1
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }


            return valor.divide(new BigDecimal("2.0"), RoundingMode.HALF_UP);
        }
    },

    CORTESIA {

        @Override
        public BigDecimal aplicaDesconto(BigDecimal valor) {

            if (valor == null) {
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }

            if (valor.compareTo(BigDecimal.ZERO) < 0) { // se for menor, ele retorna -1
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }


            return BigDecimal.ZERO;
        }
    },

    AMIGOS_DA_PAULA {

        @Override
        public BigDecimal aplicaDesconto(BigDecimal valor) {

            if (valor == null) {
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }

            if (valor.compareTo(BigDecimal.ZERO) < 0) { // se for menor, ele retorna -1
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }


            return valor.multiply(new BigDecimal("0.25"));
        }
    },

    ALUNOS_OT9 {

        @Override
        public BigDecimal aplicaDesconto(BigDecimal valor) {

            if (valor == null) {
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }

            if (valor.compareTo(BigDecimal.ZERO) < 0) { // se for menor, ele retorna -1
                throw new IllegalArgumentException("valor nao pode ser nulo");
            }

            return null;
        }

    };

    public abstract BigDecimal aplicaDesconto(BigDecimal valor);

}
