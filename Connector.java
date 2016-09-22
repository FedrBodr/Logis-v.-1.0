import java.sql.*;
import javax.swing.*;

public class javaconnect {

    Connection connection = null;

    public static Connection ConnectrDb() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/logistics", "root", "root");
            //JOptionPane.showMessageDialog(null, "Connection Established");
            return connection;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

}
