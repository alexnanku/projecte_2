package gimnas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexio {
    
    private final String server = "jdbc:mysql://localhost:3306/";
    private final String password = "345697Alex";
    private final String user = "root";
    private final String bd = "gim";
    private Connection con;

    public Connexio() {

        try {
            con = DriverManager.getConnection(server + bd, user, password); 
        } catch (SQLException e) {
        }
    }

    public void Desconexio(){
        try {
            con.close();
        } catch (SQLException e) {
        }
    }

    public Connection getCon() {
        return con;
    }
}