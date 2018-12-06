
package Store.code;

import Store.gui.Add;
import Store.gui.Search;
import Store.gui.Sell;


public class Home_c {
    public Home_c(){
        
    }
    public void gotoAdd(){
        Add a = new Add();
        a.setVisible(true);
    }
    public void gotoSelling(){
        Sell s = new Sell();
        s.setVisible(true);
    }
    public void gotoSearch(){
        Search s = new Search();
        s.setVisible(true);
    }
}
