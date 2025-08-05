package org.logic.puzzles;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MoneyTest {

    @Test
    public void convert_EURO_to_DOLLAR() {
        final Money moneyInEuros = Money.valueOf(new BigDecimal("67.89"), "EUR");
        final Money moneyInDollar =
                moneyInEuros.multiply(new BigDecimal("1.454706142288997"));
        assertEquals(new BigDecimal("98.76"), moneyInDollar.getAmount());
    }

    @Test
    public void convert_DOLLAR_to_EURO() {
        final Money moneyInDollar = Money.valueOf(new BigDecimal("98.76"), "USD");
        final Money moneyInEuros =
                moneyInDollar.multiplysecure(new BigDecimal("0.6874240583232078"));
        assertEquals(new BigDecimal("67.89"), moneyInEuros.getAmount());
    }
}