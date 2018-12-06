
package Store.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Products_c extends Home_c{
    private String ID;
    private String Name;
    private String Unit_price;
    private String Quantity;
    
    public Products_c(){
        
    }
    public Products_c(String id, String name, String price, String quantity){
        this.ID = id;
        this.Name = name;
        this.Unit_price = price;
        this.Quantity = quantity;
    }
    
     public int Productsdb(){
        int a = 0;
        Connection conn = null;
        Statement stmt = null;
        try{
            String url = "jdbc:sqlite:C:\\Users\\SabbiR\\Documents\\NetBeansProjects\\Agora_Super_Shop\\db\\Agora.db";
            conn = DriverManager.getConnection(url);
            stmt = conn.createStatement();
            String sql = "insert into Products"+
                    "(id,name,unitprice,quantity)"+
                    "values"+
                    "('"+ID+"','"+Name+"','"+Unit_price+"','"+Quantity+"');";
                    
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
