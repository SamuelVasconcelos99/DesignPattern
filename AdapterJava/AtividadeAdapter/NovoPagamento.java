package AtividadeAdapter;

public class NovoPagamento implements INovoPagamento{
    
    private Pagamento pagamento;

    public NovoPagamento(Pagamento pagamentoAdapter){
        this.pagamento = pagamentoAdapter;
    }

    @Override
    public void realizarPagamento(double montante){
        this.pagamento.processarPagamento(montante);
        System.out.println("Realizando -novo- pagamento de: " + montante);
    }

}
