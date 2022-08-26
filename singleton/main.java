package singleton;

public class main {
    public static void main(String[] args) {
        Connection instance = Connection.getInstance("Postgresql");
        instance.toConnect();
    }
}
