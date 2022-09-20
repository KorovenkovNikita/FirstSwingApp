package com.swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input");
    private JRadioButton firstRadio = new JRadioButton("Select this");
    private JRadioButton secondRadio = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI() {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(firstRadio);
        group.add(secondRadio);
        container.add(firstRadio);
        firstRadio.setSelected(true);
        container.add(secondRadio);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String massage = "";
            massage += "Button was pressed\n";
            massage += "Text is " + input.getText() + "\n";
            massage += (firstRadio.isSelected() ? "Radio#1" : "Radio#2" + "is selected!\n");
            massage += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, massage, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
