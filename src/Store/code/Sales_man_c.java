
package Store.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Sales_man_c extends Home_c{
    private String ID;
    private String Name;
    
    public Sales_man_c(){
        
    }
    public Sales_man_c(String id, String name){
        this.ID = id;
        this.Name = name;
    }
    
    public int SalesMandb(){
        int a = 0;
        Connection conn = null;
        Statement stmt = null;
        try{
            String url = "jdbc:sqlite:C:\\Users\\SabbiR\\Documents\\NetBeansProjects\\Agora_Super_Shop\\db\\Agora.db";
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            String sql = "insert into  SalesMan"+
                    "(id,name)"+
                    "values"+
                    "('"+ID+"','"+Name+"');";
                    
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
