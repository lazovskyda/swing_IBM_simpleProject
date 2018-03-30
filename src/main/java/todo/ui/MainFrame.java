package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import todo.ui.button.ActionListenerButton;
import todo.ui.button.AddNewButtonActionListener;
import todo.ui.button.DeleteButtonActionListener;

import java.awt.*;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.swing.*;


@Component("mainFrame")
public class MainFrame extends JFrame {


    @Autowired
    @Qualifier("mainPanel")
    @Override
    public void setContentPane(Container contentPane) {
        super.setContentPane(contentPane);
    }


    @Autowired
    @Value("!!SPAAARTAAA")

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @PostConstruct
	public void init() {
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setSize(new Dimension(600, 400));

		setVisible(true);
		setState(Frame.NORMAL);
		show();
	}

}