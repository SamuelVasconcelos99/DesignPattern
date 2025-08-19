public class Users implements IObserver{

    @Override
    public void Update(double memoryUsage){
        if (memoryUsage > 85){
            System.out.println("Notificação para usuário! Memória ultrapassou 85%");
        }
    }
}