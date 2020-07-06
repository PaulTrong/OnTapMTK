
package structional.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TRONG
 */
public class Khoa extends AbstractComposite{
    List<AbstractComposite> ds = new ArrayList();

    public Khoa(String name) {
        super(name);
    }

    @Override
    public void add(AbstractComposite item) {
           ds.add(item);
           item.prefix += this.prefix + "..";
    }

    @Override
    public String show() {
        String str = prefix + name;
        for (AbstractComposite item: ds){
            str += "\n" + item.show();
        }
        return str;
    }
    
}
