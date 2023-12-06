public class Customer {
    private String  name;
    private CreditCard creditCard;
    public customer(String name, long cardno){
        this.name = name;
        this.creditCard = new CreditCard(cardno);

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", creditCard=" + creditCard +
                '}';
    }
}
