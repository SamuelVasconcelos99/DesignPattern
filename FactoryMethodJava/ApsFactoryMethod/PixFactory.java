package ApsFactoryMethod;

public class PixFactory extends PaymentFactory{

    @Override
    public Pix criarPagamento(){
        return new Pix();
    }
    
}
