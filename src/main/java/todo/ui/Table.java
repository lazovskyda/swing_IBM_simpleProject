package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.TableModel;

@Component("itemTable")
public class Table extends JTable{
//    <bean id="itemTable" class="javax.swing.JTable">
//		<property name="model">
//			<ref bean="itemTableModel" />
//		</property>
//	</bean>
//
//
//



    @Autowired
    @Qualifier("itemTableModel")
    @Override
    public void setModel(TableModel dataModel) {
        super.setModel(dataModel);
    }
}
