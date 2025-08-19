package ApsFactoryMethod;

public abstract class PaymentFactory {
    
    public abstract IPayment criarPagamento();

    public int makePayment(){
        IPayment payment = criarPagamento();
        return payment.efetuarPagamento();
    }
    

}
 