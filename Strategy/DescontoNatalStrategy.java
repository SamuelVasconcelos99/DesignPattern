// Estratégia concreta - Strategy
public class DescontoNatalStrategy implements IDesconto {

    @Override
    public double aplicaDesconto(double preco){

        //Desconto de 30%
        return preco * 0.7;

    }
}