
package ConnectData;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tran Tien Dung
 */
public class MyConnection {
    private static Connection conn = null;
    private static final String URL= "jdbc:mysql://localhost:3306/";
    private static final String USER= "root";
    private static final String PASSWORD ="";
    
    public static Connection getConnection() {
        try {
            conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch ( SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public static void freeConnection() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
