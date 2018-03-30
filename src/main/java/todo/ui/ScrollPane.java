package todo.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.*;
import java.awt.*;


@org.springframework.stereotype.Component("itemScrollPane")
public class ScrollPane extends JScrollPane {


    @Autowired
    public ScrollPane(JTable view) {
        super(view);
    }
}
