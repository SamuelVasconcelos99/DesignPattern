import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        HashMap<String, DatabaseConnFactory> dbs = new HashMap<String, DatabaseConnFactory>();
        dbs.put("oracle", new OracleFactory());
        dbs.put("postgres", new PostgreFactory());

        int connStatus = dbs.get("postgres").connect();

        System.out.println("Status conexão: " + connStatus);
        }
}