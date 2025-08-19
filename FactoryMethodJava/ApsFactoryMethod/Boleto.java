package ApsFactoryMethod;

public class Boleto implements IPayment {

    @Override
    public int efetuarPagamento(){
        System.out.println("Efetuando pagamento via Boleto...");
        return 1;
    }
    
}
