package todo.ui.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.List;

@Component
public class DeleteButtonActionListener extends ListTableActionListener {

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
		int selectedRow = table.getSelectedRow();

		if (selectedRow == -1) {
			// if there is no selected row, don't do anything
			return;
		}

		if (table.isEditing()) {
			// if we are editing the table, don't do anything
			return;
		}

		list.remove(selectedRow);
		table.revalidate();
	}

}