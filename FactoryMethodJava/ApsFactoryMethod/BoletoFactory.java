package ApsFactoryMethod;

public class BoletoFactory extends PaymentFactory {
    
    @Override
    public Boleto criarPagamento(){
        return new Boleto();
    }
    
}
