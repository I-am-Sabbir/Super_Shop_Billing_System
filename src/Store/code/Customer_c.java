
package Store.code;

import Store.gui.Add;
import Store.gui.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Customer_c extends Home_c{
    private String Name;
    private String ID;
    private String Address;
    public Customer_c(){
        
    }
    public Customer_c(String name, String id, String address){
        this.Name = name;
        this.ID = id;
        this.Address = address;
    }
    public int Customerdb(){
        int a = 0;
        Connection conn = null;
        Statement stmt = null;
        try{
            String url = "jdbc:sqlite:C:\\Users\\SabbiR\\Documents\\NetBeansProjects\\Agora_Super_Shop\\db\\Agora.db";
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            String sql = "insert into Customer"+
                    "(name,id,address)"+
                    "values"+
                    "('"+Name+"','"+ID+"','"+Address+"');";
                    
            stmt.executeUpdate(sql);
            stmt.close();
            conn.setAutoCommit(false);
            conn.commit(); 
            conn.close();
            JOptionPane.showMessageDialog(null,"Success");
            a = 1;
            gotoAdd();
        }
        catch(Exception e){
            a = 0;
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return a;
    }
    
}
