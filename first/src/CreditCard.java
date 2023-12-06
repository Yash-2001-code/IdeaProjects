public class CreditCard {
    private final long CardNumber;
    CreditCard(long CardNumber){
        this.CardNumber = CardNumber;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "CardNumber=" + CardNumber +
                '}';
    }
}

