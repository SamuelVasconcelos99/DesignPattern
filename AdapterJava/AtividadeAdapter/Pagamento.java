package AtividadeAdapter;

public class Pagamento implements IPagamento {
    
    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando pagamento de: " + valor);
    }
}
