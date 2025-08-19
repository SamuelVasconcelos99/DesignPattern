package ApsFactoryMethod;

public class PayPal implements IPayment {

    @Override
    public int efetuarPagamento(){
        System.out.println("Efetuando pagamento via PayPal...");
        return 1;
    }
    
}
