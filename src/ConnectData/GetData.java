/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tran Tien Dung
 */
public class GetData {
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = MyConnection.getConnection();
    
    public static void LoadData(String sql,JTable tb)
    {
        try
        {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex,"Error",1);
        }
    }
    
    public static ResultSet ShowTextField(String sql)
    {
        try
        {
            pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        }
        catch(SQLException ex)
        {
            return null;
        }
    }
}
