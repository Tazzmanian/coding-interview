package org.logic.puzzles;

import java.math.BigDecimal;

public final class Money {
    private static final String DOLAR = "USD";
    private static final String EURO = "EUR";
    private static int ROUNDING_MODE = BigDecimal.ROUND_HALF_EVEN;
    private static int DECIMALS = 2;
    private BigDecimal amount;
    private String currency;

    public Money() {
    }

    public static Money valueOf(
            BigDecimal amount,
            String currency) {
        return new Money(amount, currency);
    }

    private Money(
            BigDecimal amount,
            String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    //Currency converter
    public Money multiply(BigDecimal factor) {
        return Money.valueOf(
                rounded(this.amount.multiply(factor)),
                this.currency.equals(DOLAR) ? EURO : DOLAR);
    }

    //round to 2 decimals
    private BigDecimal rounded(BigDecimal amount) {
        return amount.setScale(DECIMALS, ROUNDING_MODE);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    //Currency converter, more secure
    public Money multiplysecure(BigDecimal factor) {
        if (factor.getClass() == BigDecimal.class)
            factor = new BigDecimal(factor.toString());
        else {
            //TODO throw exception?
        }
        return Money.valueOf(
                rounded(this.amount.multiply(factor)),
                this.currency.equals(DOLAR) ? EURO : DOLAR);
    }
}
