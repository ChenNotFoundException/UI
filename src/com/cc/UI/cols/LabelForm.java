/*
 * Created by JFormDesigner on Thu Dec 27 19:05:55 CST 2018
 */

package com.cc.UI.cols;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import info.clearthought.layout.*;


/**
 * @author chenchen
 */
public class LabelForm extends JDialog {
  public static void main(String[] args) {
    LabelForm labelForm = new LabelForm();
    //
  }

    public LabelForm() {
        initComponents();
    }

    private void myInit() {
        //this.setIconImage(null);
        Icon icon = new ImageIcon("com/cc/UI/icons/choose.png");
        //button1.setIcon(icon);
    }

    private void label1MouseClicked(MouseEvent e) {
    // TODO add your code here
    System.out.println("1111");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== this ========
        setAlwaysOnTop(true);
        setVisible(true);
        setResizable(false);
        setMinimumSize(new Dimension(1, 1));
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("text");

        //---- button2 ----
        button2.setText("text");

        //---- button3 ----
        button3.setText("text");

        //---- button4 ----
        button4.setText("text");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(button1, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addComponent(button2, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addComponent(button3, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addComponent(button4, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button3)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button4)
                    .addContainerGap(9, Short.MAX_VALUE))
        );
        setSize(75, 155);
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
