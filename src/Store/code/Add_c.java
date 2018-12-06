
package Store.code;

import Store.gui.Customer;
import Store.gui.Home;
import Store.gui.Products;
import Store.gui.Sales_man;


public class Add_c {
    public Add_c(){
        
    }
    public void gotoHome(){
        Home h = new Home();
        h.setVisible(true);
    }
    
    public void gotoCustomer(){
        Customer c = new Customer();
        c.setVisible(true);
    }
    
    public void gotoSalesMan(){
        Sales_man sm = new Sales_man();
        sm.setVisible(true);
    }
    
    public void gotoProducts(){
        Products p = new Products();
        p.setVisible(true);
    }
}
