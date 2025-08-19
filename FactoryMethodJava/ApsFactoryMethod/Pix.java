package ApsFactoryMethod;

public class Pix implements IPayment {
    
    @Override
    public int efetuarPagamento(){
        System.out.println("Efetuando pagamento via Pix...");
        return 1;
    }
}