package todo.ui.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;


@Component
public class AddNewButtonActionListener extends ListTableActionListener {



	@Autowired
	@Override
	public void setList(List list) {
		super.setList(list);
	}

	@Autowired
	@Override
	public void setTable(JTable itemTable) {
		super.setTable(itemTable);
	}


	public void actionPerformed(ActionEvent e) {
		list.add("New Item");
		table.revalidate();
	}

}