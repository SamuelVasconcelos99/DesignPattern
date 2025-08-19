public class Admin implements IObserver {
    
    public void Update(double memoryUsage){
        if(memoryUsage > 50){
            System.out.println("Notificação para usuário admin! Memóeria ultrapassou 50%");
        }
    }
}