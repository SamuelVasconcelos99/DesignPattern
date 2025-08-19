package AtividadeAdapter;

public class Main {
    
    public static void main(String[] args) {

        Pagamento pagamento = new Pagamento();
        NovoPagamento novoPagamento = new NovoPagamento();

        pagamento.processarPagamento(100);
        novoPagamento.ajustarPagamento(pagamento);
        novoPagamento.realizarPagamento(200);
    }
    
}
