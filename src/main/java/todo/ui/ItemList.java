package todo.ui;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component

public class ItemList extends ArrayList {


    public ItemList(){
        super.add("Item 1112222");
        super.add("Item 222333");
        super.add("Item 222333");
    }
}
