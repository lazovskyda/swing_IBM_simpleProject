package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import todo.ui.button.ActionListenerButton;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.swing.*;


@Configuration

public class BoxLayoutPanel extends JPanel {
	/**
	 * We can't use "components" as the property name, because it conflicts with
	 * an existing property on the Component superclass.
	 */
	private List panelComponents;
	private int axis;


	@Autowired
	@Qualifier("deleteButton")
	private ActionListenerButton deleteButton;

	@Autowired
	@Qualifier("addNewButton")
	private ActionListenerButton addNewButton;


	@Bean(initMethod = "init")
	@Lazy
//	@Scope(value = "prototype")
	public BoxLayoutPanel buttonPanel(){
		List buttons = new ArrayList();

		buttons.add(deleteButton);
		buttons.add(addNewButton);

		this.setAxis(0);
		this.setPanelComponents(buttons);
		return this;
	}




	@Autowired
	private JScrollPane itemScrollPane;

	@Autowired
	@Qualifier("buttonPanel")
	private BoxLayoutPanel buttonPanel;



	@Bean(initMethod = "init")

	public BoxLayoutPanel mainPanel(){
		List array1 = new ArrayList();
		BoxLayoutPanel bean = new BoxLayoutPanel();

		array1.add(itemScrollPane);
		array1.add(buttonPanel);
		bean.setAxis(1);
		bean.setPanelComponents(array1);
//		bean.init();

		return bean;
	}







//	@Autowired
//	@Value("1")

	public void setAxis(int axis) {
		this.axis = axis;
	}

	public void setPanelComponents(List panelComponents) {
		this.panelComponents = panelComponents;
	}



	public void init() {

		setLayout(new BoxLayout(this, axis));

		for (Iterator iter = panelComponents.iterator(); iter.hasNext();) {
			Component component = (Component) iter.next();
			add(component);
		}
	}
}