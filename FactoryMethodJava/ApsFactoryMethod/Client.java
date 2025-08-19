package ApsFactoryMethod;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<String, PaymentFactory> payments = new HashMap<String, PaymentFactory>();
        payments.put("Pix", new PixFactory());
        payments.put("Boleto", new BoletoFactory());
        
        int pagamento = payments.get("Pix").criarPagamento();

        }
} 
