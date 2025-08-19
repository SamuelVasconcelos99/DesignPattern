package ApsFactoryMethod;

public class PayPalFactory extends PaymentFactory {

    @Override
    public PayPal criarPagamento(){
        return new PayPal();
    }
}
