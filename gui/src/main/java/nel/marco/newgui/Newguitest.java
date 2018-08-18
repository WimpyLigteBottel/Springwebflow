package nel.marco.newgui;

import nel.marco.restservice.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class Newguitest {


    RestService restService;

    JFrame jFrame = new JFrame("mainframe");

    @Autowired
    public Newguitest(RestService restService) {
        this.restService = restService;


        jFrame.setSize(400,400);
        jFrame.setLayout(new FlowLayout());
        jFrame.add(panel1);

        helloWorld2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                restService.helloWorld();
            }
        });


        repeatBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                restService.repeat(repeatTextField.getText());
            }
        });

        jFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jFrame.setVisible(true);
    }

    private JButton helloWorld2;
    private JPanel panel1;
    private JCheckBox checkBox1;
    private JButton repeatBtn;
    private JTextField repeatTextField;
}

