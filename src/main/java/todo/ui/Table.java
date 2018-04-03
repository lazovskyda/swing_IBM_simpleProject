package todo.ui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.TableModel;

@Component("itemTable")
//@Configuration
public class Table extends JTable {



    @Autowired
    @Qualifier("itemTableModel")
    @Override
    public void setModel(TableModel dataModel) {
        super.setModel(dataModel);
    }
}
