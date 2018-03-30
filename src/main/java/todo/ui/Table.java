package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.TableModel;

@Configuration
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
    private TableModel dataModel;

    @Bean
    public Table itemTable(){
        Table table = new Table();
        table.setModel(dataModel);
        return table;
    }


//    @Autowired
//    @Qualifier("itemTableModel")
//    @Override
//    public void setModel(TableModel dataModel) {
//        super.setModel(dataModel);
//    }
}
