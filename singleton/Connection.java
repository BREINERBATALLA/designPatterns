package singleton;

public class Connection {
    private static Connection instance;

    private String conexionSGBD;

    private Connection (String conexionSGBD){
        this.conexionSGBD = conexionSGBD;
    }

    public static Connection getInstance(String conexionSGBD){
        if (instance==null) {
            instance = new Connection(conexionSGBD);
        }
        return instance;
    }

    public void toConnect() {
        System.out.println("Connection throught " + this.conexionSGBD);
    }
}
