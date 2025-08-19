import java.util.ArrayList;
import java.util.Observer;

public class VirtualMachine{

    //Agregação com assinantes - TEM UM
    private ArrayList<IObserver> assinantes = new ArrayList<>();
    private double memoryUsage;
    public void addObserver(IObserver observer){
        assinantes.add(observer);
    }

    public void removeObserver(IObserver observer){
        assinantes.remove(observer);
    }

    public void setMemoryUsage(double valor){
        this.memoryUsage = valor;
        this.notifyObservers();
    }

    public void notifyObservers(){
        for (IObserver assinante: assinantes){
            assinante.Update(memoryUsage);
        }
    }
}