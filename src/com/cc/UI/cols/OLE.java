/*
 * Created by JFormDesigner on Fri Jan 25 14:49:44 CST 2019
 */

package com.cc.UI.cols;

import java.awt.*;
import javax.swing.*;
import org.jdesktop.swingx.*;

/**
 * @author cc
 */
public class OLE extends JDialog {
    public static void main(String[] args) {
        OLE ole = new OLE();

    }

    public OLE() {
        super();
        initComponents();
    }

    public OLE(Frame owner) {
        super(owner);
        initComponents();
    }

    public OLE(Dialog owner) {
        super(owner);
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        panel1 = new JPanel();
        button3 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        panel2 = new JPanel();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();

        //======== this ========
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setLayout(new GridLayout(5, 2, 1, 0));

            //---- button3 ----
            button3.setIcon(new ImageIcon(getClass().getResource("/\u5927\u5199.png")));
            panel1.add(button3);

            //---- button5 ----
            button5.setIcon(new ImageIcon(getClass().getResource("/\u65b9\u6846.jpg")));
            panel1.add(button5);

            //---- button6 ----
            button6.setIcon(new ImageIcon(getClass().getResource("/\u4e0a.png")));
            panel1.add(button6);

            //---- button7 ----
            button7.setIcon(new ImageIcon(getClass().getResource("/\u5de6.png")));
            panel1.add(button7);

            //---- button8 ----
            button8.setIcon(new ImageIcon(getClass().getResource("/\u7528\u6237.png")));
            panel1.add(button8);
        }

        //======== panel2 ========
        {
            panel2.setLayout(new GridLayout(5, 2, 1, 0));

            //---- button12 ----
            button12.setIcon(new ImageIcon(getClass().getResource("/\u659c\u7ebf.png")));
            panel2.add(button12);

            //---- button13 ----
            button13.setIcon(new ImageIcon(getClass().getResource("/\u5706\u5708.png")));
            panel2.add(button13);

            //---- button14 ----
            button14.setIcon(new ImageIcon(getClass().getResource("/\u4e0b.png")));
            panel2.add(button14);

            //---- button15 ----
            button15.setIcon(new ImageIcon(getClass().getResource("/\u53f3.png")));
            panel2.add(button15);

            //---- button16 ----
            button16.setIcon(new ImageIcon(getClass().getResource("/\u8bb0\u4e8b\u672c.png")));
            panel2.add(button16);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                    .addGap(7, 7, 7))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap())
        );
        setSize(200, 300);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JPanel panel1;
    private JButton button3;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel panel2;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
