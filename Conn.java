import java.sql.*;
public class Conn {

    Connection c;
    Statement s;

    public Conn () {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "urvipatel");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
