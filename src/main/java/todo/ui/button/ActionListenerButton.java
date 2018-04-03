package todo.ui.button;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.event.ActionListener;
import javax.swing.JButton;

@Configuration
public class ActionListenerButton extends JButton {
    private ActionListener actionListener;


    @Autowired
    @Qualifier("deleteButtonActionListener")
    private DeleteButtonActionListener deleteButtonActionListener;





    @Bean(initMethod = "init")
    public ActionListenerButton deleteButton(){
        ActionListenerButton deleteButton = new ActionListenerButton();
        deleteButton.setActionListener(deleteButtonActionListener);
        deleteButton.setText("Delete");
        return deleteButton;
    }


    @Autowired
    @Qualifier("addNewButtonActionListener")
    private AddNewButtonActionListener addNewButtonActionListener;


    @Bean(initMethod = "init")
    public ActionListenerButton addNewButton(){
        ActionListenerButton addButton = new ActionListenerButton();
        addButton.setActionListener(addNewButtonActionListener);
        addButton.setText("Add New");
        return addButton;
    }




    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void init() {
        this.addActionListener(actionListener);
    }
}