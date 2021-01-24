

class Money {
    private int fAmount;
    private String fCurrency;

    public Money(int amount, String currency) {
        fAmount= amount;
        fCurrency= currency;
    }

    public int amount() {
        return fAmount;
    }

    public String currency() {
        return fCurrency;
    }

    public boolean equals(Money m) {
	return(amount() == m.amount() &&  currency() == m. currency());
    }
    
    public Money add(Money m) {
	return new Money(amount()+m.amount(), currency());
    }
}
